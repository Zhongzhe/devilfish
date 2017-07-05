package com.yz.devilfish.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * Created by kyuan on 2017/7/4.
 */
@RestController
@EnableAutoConfiguration
public class BlogController {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(BlogController.class,args);
    }




}
