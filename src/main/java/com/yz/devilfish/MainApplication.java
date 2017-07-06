package com.yz.devilfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kyuan on 2017/7/5.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan //(@Component,@Service,@Repository,@Controller注解的bean会被自动注册为spring bean)
//用@SpringBootApplication代替上面三个的注解是一样的效果
public class MainApplication {

    public static void main(String[] args){
        //System.setProperty("spring.devtools.restart.enabled","false"); //禁用热启动
        SpringApplication.run(MainApplication.class,args);
    }
}
