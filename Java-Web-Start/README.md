JDK keytool common commands:
-genkey：在用戶主目錄中創建一個預設檔".keystore",還會產生一個mykey的別名，mykey中包含用戶的公開金鑰、私密金鑰和證書(在沒有指定生成位置的情況下,keystore會存在使用者系統預設目錄，如：對於windows系統，會生成在系統的C:\Documents and Settings\UserName\檔案名為“.keystore”)
-alias：產生別名
-keystore：指定金鑰庫的名稱(產生的各類資訊將不在.keystore文件中)
-keyalg：指定金鑰的演算法 (如 RSA  DSA（如果不指定默認採用DSA）)
-validity：指定創建的證書有效期多少天
-keysize：指定金鑰長度
-storepass：指定金鑰庫的密碼(獲取keystore資訊所需的密碼)
-keypass：指定別名條目的密碼(私密金鑰的密碼)
-dname：指定證書擁有者資訊 例如：  "CN=名字與姓氏,OU=組織單位名稱,O=組織名稱,L=城市或區域名稱,ST=州或省份名稱,C=單位的兩字母國家代碼"
-list：顯示金鑰庫中的證書資訊      keytool -list -v -keystore 指定keystore -storepass 密碼
-v ：顯示金鑰庫中的證書詳細資訊
-export：將別名指定的證書匯出到檔  keytool -export -alias 需要匯出的別名
-keystore：指定keystore -file 指定匯出的證書位置及證書名稱 -storepass 密碼
-file：參數指定匯出到檔的檔案名
-delete：刪除金鑰庫中某條目 keytool -delete -alias 指定需刪除的別名； -keystore 指定keystore；-storepass 指定密碼
-printcert：查看匯出的證書資訊          keytool -printcert -file yushan.crt
-keypasswd：修改金鑰庫中指定條目指令：keytool -keypasswd -alias 需修改的別名 -keypass 舊密碼 -new  新密碼  -storepass keystore密碼  -keystore sage
-storepasswd：修改keystore指令：keytool -storepasswd -keystore e:\polin.keystore(需修改口令的keystore) -storepass 123456(原始密碼) -new polinwei(新密碼)
-import：將已簽名數位憑證導入金鑰庫  keytool -import -alias 指定導入條目的別名 -keystore 指定keystore -file 需導入的證書