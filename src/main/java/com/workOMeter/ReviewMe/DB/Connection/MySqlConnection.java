package com.workOMeter.ReviewMe.DB.Connection;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EntityScan("com.vflux.rbot.services.account.domain")
@PropertySource("classpath:application.properties")

public class MySqlConnection {

	@Value("${app.datasource.driverClassName}") String driverClassName;
    @Value("${app.datasource.url}") String url;
    @Value("${app.datasource.username}") String username;
    @Value("${app.datasource.password}") String password;
    
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	DataSource dataSource = (DataSource) DataSourceBuilder
    			.create()
    			.username(username)
    			.password(password)
    			.url(url)
    			.driverClassName(driverClassName)
    			.build();
    	return dataSource;
    }
    
}
