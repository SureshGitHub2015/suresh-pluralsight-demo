package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://192.168.99.100:5432/conference_app");
        builder.username("postgres");
        builder.password("Welcome");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }

}
