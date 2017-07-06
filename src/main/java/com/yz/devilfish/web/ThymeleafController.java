package com.yz.devilfish.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kyuan on 2017/7/6.
 */


@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping(value="/greeting",method= RequestMethod.GET)
    public String greeting(){
        return "greet";
    }


}
