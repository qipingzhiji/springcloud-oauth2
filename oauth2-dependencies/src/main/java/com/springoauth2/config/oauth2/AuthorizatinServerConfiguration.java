package com.springoauth2.config.oauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by zhang_htao on 2019/9/28.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizatinServerConfiguration extends AuthorizationServerConfigurerAdapter {


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client")
                .secret("client")
                .authorizedGrantTypes("authorization_code")
                .scopes("app")
                .redirectUris("https://www.baidu.com");
    }
}
