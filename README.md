# vault-starter

1. Install vault on the machine
2. Start the vault dev server using "vault server -dev"
3. Get the token
4. Use the token to login into vault UI running on localhost:8200
5. Create a new secret eg: app-config
6. Add some properties to the secret eg: app.name=vault-starter
7. Use the created secret as vault property source in application
8. Build the project
9. Start the application with "java -jar vault-starter-0.0.1-SNAPSHOT.jar -Dvault.uri=http://127.0.0.1:8200 -Dspring.vault.token=*/*token*/*
10. Test application at localhost:8080/config

We can entirely move all the configuration properties into the vault from the application code.

But why to do this?

1. Vault is more secure so we can safely keep credentials, keys etc.
2. Centralized so easier to update/rotate properties
3. Encrypted
4. Versioning

and more.