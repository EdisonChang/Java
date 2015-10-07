## JDK Keytool Common Commands:
#####-genkey: generate keys <br>
#####-alias: generate alias <br>
#####-keystore: specify the name (and optionally path) of the keystore you are creating or already using <br>
#####-keyalg: specify key algorithm (Example: RSA  DSA（default is DSA）) <br>
#####-validity: specify expiry day <br>
#####-keysize: specify key length <br>
#####-storepass: specify key password (the password is for get keystore information) <br>
#####-keypass: specify entry password (private password) <br>
#####-dname: Distinguished-Name Information "CN=first and last name,OU=organizational unit,O=organization,L=City or Locality,ST=State or Province,C=two-letter country code for this unit" <br>
#####-list: display keystore information - keytool -list -v -keystore [KEYSTORE NAME] -storepass [PASSWORD] <br>
#####-v: display keystore detail information <br>
#####-export: export specified keystore to certificate file <br> 
##### +Examole: keytool -export -alias [ALIAS NAME] -file [CERTIFICATE NAME].cer <br>
#####-keystore: 指定keystore -file 指定匯出的證書位置及證書名稱 -storepass 密碼 <br>
#####-file: 參數指定匯出到檔的檔案名 <br>
#####-delete: 刪除金鑰庫中某條目 keytool -delete -alias 指定需刪除的別名； -keystore 指定keystore；-storepass 指定密碼 <br>
#####-printcert: 查看匯出的證書資訊 keytool -printcert -file yushan.crt <br>
#####-keypasswd: 修改金鑰庫中指定條目指令：keytool -keypasswd -alias 需修改的別名 -keypass 舊密碼 -new  新密碼  -storepass keystore密碼  -keystore sage <br>
#####-storepasswd: 修改keystore指令：keytool -storepasswd -keystore e:\polin.keystore(需修改口令的keystore) -storepass 123456(原始密碼) -new polinwei(新密碼) <br>
#####-import: 將已簽名數位憑證導入金鑰庫  keytool -import -alias 指定導入條目的別名 -keystore 指定keystore -file 需導入的證書 <br>
