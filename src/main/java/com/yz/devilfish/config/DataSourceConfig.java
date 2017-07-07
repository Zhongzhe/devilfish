package com.yz.devilfish.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by kyuan on 2017/7/7.
 */

@Configuration
@EnableAutoConfiguration
public class DataSourceConfig {

    @Bean(name="db1")
    @Primary
    @ConfigurationProperties(prefix = "db1.datasource")
    public DataSource getDB1(){
        return DataSourceBuilder.create().build();
    }


    @Bean(name="db2")
    @ConfigurationProperties(prefix = "db2.datasource")
    public DataSource getDB2(){
        return DataSourceBuilder.create().build();
    }

}
