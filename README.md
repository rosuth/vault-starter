# vault-starter

1. Install vault on the machine
2. Start the vault dev server using "vault server -dev"
3. Get the token
4. Use the token to login into vault UI running on localhost:8200
5. Create a new secret eg: app-config
6. Add some properties to the secret
7. Use the created secret as vault property source in application
8. Start the application with "java -jar vault-starter-0.0.1-SNAPSHOT.jar -Dvault.uri=http://127.0.0.1:8200 -Dspring.vault.token=*/*token*/*
