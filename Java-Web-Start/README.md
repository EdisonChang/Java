## JDK Keytool Common Commands:
-genkey: generate keys <br>
-alias: generate alias <br>
-keystore: specify the name (and optionally path) of the keystore you are creating or already using <br>
-keyalg: specify key algorithm (Example: RSA  DSA（default is DSA）) <br>
-validity: specify expiry day <br>
-keysize: specify key length <br>
-storepass: specify key password (the password is for get keystore information) <br>
-keypass: specify entry password (private password) <br>
-dname: Distinguished-Name Information "CN=first and last name,OU=organizational unit,O=organization,L=City or Locality,ST=State or Province,C=two-letter country code for this unit" <br>
-list: display keystore information <br>
-v: display keystore detail information <br>
Example: keytool -list -v -keystore [KEYSTORE FILE] -storepass [PASSWORD] <br>
-export: export specified keystore to certificate file <br> 
Example: keytool -export -alias [ALIAS NAME] -keystore [KEYSTORE FILE] -file [CERTIFICATE FILE] -storepass [PASSWORD] <br>
-file: specify export file name <br>
-delete: delete entry in keystore <br> 
Example: keytool -delete -alias [ALIAS NAME] -keystore [KEYSTORE FILE] -storepass [PASSWORD] <br>
-printcert: look over certificate information <br>
Example: keytool -printcert -file yushan.crt <br>
-keypasswd: modify entry in keysrtore <br>
Example: keytool -keypasswd -alias [ALIAS NAME] -keypass [OLD PASSWORD] -new [NEW PASSWORD] -storepass [PASSWORD] -keystore [KEYSTORE FILE] <br>
-storepasswd: modify keysrtore <br>
Example: keytool -storepasswd -keystore [KEYSTORE FILE] -storepass [ORIGINAL PASSWORD] -new [NEW PASSWORD] <br>
-import: import the signed digital certificate to keystore <br>
Example: keytool -import -alias [ALIAS NAME] -keystore [KEYSTORE FILE] -file [CERTIFICATE FILE] <br>
