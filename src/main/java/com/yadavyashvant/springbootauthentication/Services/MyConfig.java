package com.yadavyashvant.springbootauthentication.Services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MyConfig {
    @Bean
    public userDetailsService userDetailsService() {

        //This will be the service that will be used to get the user details from the database
    }
}
