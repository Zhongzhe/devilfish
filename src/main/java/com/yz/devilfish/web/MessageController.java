package com.yz.devilfish.web;

import com.yz.devilfish.domain.Message;
import com.yz.devilfish.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by kyuan on 2017/7/4.
 */
@Controller
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/all")
    public String getAllMessage(Model model){
        List<Message> msgList = messageService.findAllMessage();;
        model.addAttribute("msgList",msgList);
        return "greet";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/add")
    public String addMessage(Message msg){
        Message msg1 = new Message();
        msg.setTitle("测试事物是否按照异常回滚");
        msg.setContent("test");
        msg.setPublisher("kevin test");
        msg.setCreateDate(1);
        msg.setUpdateDate(2);
        messageService.addMessage(msg);
        return "test";
    }

}
