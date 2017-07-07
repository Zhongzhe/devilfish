package com.yz.devilfish.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;

/**
 * Created by kyuan on 2017/7/7.
 */

@Configuration
@EnableAutoConfiguration
@MapperScan(basePackages="com.yz.devilfish.mapper")
public class MybatisConfig {

    @Autowired
    @Qualifier("db1")
    private DataSource db1;

    private final String mybatisConfigLocation = "classpath:mybatis-config.xml";

    private ResourceLoader resourceLoader = new DefaultResourceLoader();


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setConfigLocation(resourceLoader.getResource(mybatisConfigLocation));
        factoryBean.setDataSource(db1);
        return factoryBean.getObject();
    }


}
