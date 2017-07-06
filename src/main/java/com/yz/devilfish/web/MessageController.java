package com.yz.devilfish.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kyuan on 2017/7/4.
 */
@RestController
@EnableAutoConfiguration
public class MessageController {

    @RequestMapping("/")
    String home(){
        return "Hello 曾哥!!";
    }

}
