
public HashMap<String, byte[]> dataCacheMap = new HashMap<String, byte[]>();
public HashMap<String, Vector> timeseriesDataCacheMap = new HashMap<String, Vector>();

public static void DecompressIntoMemory(String inFilePath) {
		try {
			
			File fi = new File(inFilePath);
			
			FileInputStream fis = new FileInputStream(fi);
			ZipInputStream zin  = new ZipInputStream(new BufferedInputStream(fis));
			ZipEntry entry;
			while((entry = zin.getNextEntry()) != null) {
				if (!entry.isDirectory()) {
		      String[] pathArray = StringUtils.split(entry.getName(), '\\');
		      String tailStr = pathArray[5];
		      for (int i = 6; i < pathArray.length; i++) {
		        tailStr = tailStr + File.separatorChar + pathArray[i];
		      }
		            
		      int count;
		      byte data[] = new byte[BUFFER];
		            
		      if (tailStr.equalsIgnoreCase("AnotherCompressFile")){
		        DecompressTimeSeriesIntoMemory(zin, timeseriesDataCacheMap);
		      } else {
			      ByteArrayOutputStream baos = new ByteArrayOutputStream();
					  while ((count = zin.read(data, 0, BUFFER)) != -1) {
						  baos.write(data, 0, count);
					  }
            dataCacheMap.put(tailStr.toLowerCase(), baos.toByteArray());
						baos.close();
		      }
				}
			}
			zin.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("File Reading failed: " + inFilePath);
			e.printStackTrace();
		}
}

private static void DecompressTimeSeriesIntoMemory(ZipInputStream zin, HashMap<String, Vector> timeseriesDataCacheMap) {
		try {
			int count;
	    byte data[] = new byte[BUFFER];
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    while ((count = zin.read(data, 0, BUFFER)) != -1) {
			  baos.write(data, 0, count);
		  }
	    InputStream is = new ByteArrayInputStream(baos.toByteArray());
	    baos.close();
	    	
	    ZipInputStream zinTimeSeries = new ZipInputStream(new BufferedInputStream(is));
			ZipEntry entryTimeSeries;
			while((entryTimeSeries = zinTimeSeries.getNextEntry()) != null) {
	      String[] pathArray = StringUtils.split(entryTimeSeries.getName(), '\\');
	      String tailStr = pathArray[5];
	      for (int i = 6; i < pathArray.length; i++) {
	        String[] nameArray = StringUtils.split(pathArray[i], '_');
	        tailStr = tailStr + File.separatorChar;
	        for (int j = 0; j < nameArray.length - 1; j++) {
	          tailStr = tailStr + "_" + nameArray[j];
	        }
	      }
	            
	      ByteArrayOutputStream timeSeriesBaos = new ByteArrayOutputStream();
				while ((count = zinTimeSeries.read(data, 0, BUFFER)) != -1) {
				  timeSeriesBaos.write(data, 0, count);
			  }
				Vector vec = new Vector();
				vec.add(pathArray[pathArray.length-1]);
				vec.add(timeSeriesBaos.toByteArray());
        timeseriesDataCacheMap.put(tailStr.toLowerCase(), vec);
				timeSeriesBaos.close();
			}
			is.close();
			zinTimeSeries.close();
		} catch (Exception e) {
			System.err.println("File Unziping failed: Time Series");
			e.printStackTrace();
		}
}
