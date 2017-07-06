package com.yz.devilfish.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by kyuan on 2017/7/6.
 */


public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("app.datasource.foo")
    @Primary
    public DataSourceProperties fooDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.foo")
    @Primary
    public DataSource fooDataSource(){
        return fooDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    @ConfigurationProperties("app.datasource.bar")
    @Primary
    public DataSourceProperties barDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("app.datasource.bar")
    @Primary
    public DataSource barDataSource(){
        return barDataSourceProperties().initializeDataSourceBuilder().build();
    }

}
