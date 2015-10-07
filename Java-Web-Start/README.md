## JDK Keytool Common Commands:
####-genkey: generate keys <br>
####-alias: generate alias <br>
####-keystore: appoint the name (and optionally path) of the keystore you are creating or already using <br>
####-keyalg: appoint key algorithm (Example: RSA  DSA（default is DSA）) <br>
####-validity: appoint expiry day <br>
####-keysize: appoint key length <br>
####-storepass: appoint key password (the password is for get keystore information) <br>
####-keypass: 指定別名條目的密碼(私密金鑰的密碼) <br>
####-dname: 指定證書擁有者資訊 例如： "CN=名字與姓氏,OU=組織單位名稱,O=組織名稱,L=城市或區域名稱,ST=州或省份名稱,C=單位的兩字母國家代碼" <br>
####-list: 顯示金鑰庫中的證書資訊 keytool -list -v -keystore 指定keystore -storepass 密碼 <br>
####-v: 顯示金鑰庫中的證書詳細資訊 <br>
####-export: 將別名指定的證書匯出到檔 keytool -export -alias 需要匯出的別名 <br>
####-keystore: 指定keystore -file 指定匯出的證書位置及證書名稱 -storepass 密碼 <br>
####-file: 參數指定匯出到檔的檔案名 <br>
####-delete: 刪除金鑰庫中某條目 keytool -delete -alias 指定需刪除的別名； -keystore 指定keystore；-storepass 指定密碼 <br>
####-printcert: 查看匯出的證書資訊 keytool -printcert -file yushan.crt <br>
####-keypasswd: 修改金鑰庫中指定條目指令：keytool -keypasswd -alias 需修改的別名 -keypass 舊密碼 -new  新密碼  -storepass keystore密碼  -keystore sage <br>
####-storepasswd: 修改keystore指令：keytool -storepasswd -keystore e:\polin.keystore(需修改口令的keystore) -storepass 123456(原始密碼) -new polinwei(新密碼) <br>
####-import: 將已簽名數位憑證導入金鑰庫  keytool -import -alias 指定導入條目的別名 -keystore 指定keystore -file 需導入的證書 <br>
