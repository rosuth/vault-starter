package com.vaultstarter.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;
import org.springframework.vault.core.VaultTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class VaultAppConfig extends AbstractVaultConfiguration {

    @Value("${vault.uri}")
    String uri;

    @Bean
    public VaultEndpoint vaultEndpoint() {

        String uri = System.getProperty("vault.uri");
        try {
            return VaultEndpoint.from(new URI(uri));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ClientAuthentication clientAuthentication() {
        String token = System.getProperty("spring.vault.token");
        return new TokenAuthentication(token);
    }

    @Bean
    public VaultTemplate vaultTemplate(VaultEndpoint vaultEndpoint, TokenAuthentication tokenAuthentication) {
        return new VaultTemplate(vaultEndpoint, tokenAuthentication);
    }

}