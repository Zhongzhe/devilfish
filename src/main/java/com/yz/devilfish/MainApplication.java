package com.yz.devilfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by kyuan on 2017/7/5.
 */

@SpringBootApplication
@EnableTransactionManagement
//(@Component,@Service,@Repository,@Controller注解的bean会被自动注册为spring bean)
//用@SpringBootApplication代替上面三个的注解是一样的效果
public class MainApplication {



 /*   @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
        return new Object();
    }*/

    public static void main(String[] args){
        //System.setProperty("spring.devtools.restart.enabled","false"); //禁用热启动
        SpringApplication.run(MainApplication.class,args);
    }
}
