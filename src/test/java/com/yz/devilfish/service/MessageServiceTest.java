package com.yz.devilfish.service;

import com.yz.devilfish.MainApplication;
import com.yz.devilfish.domain.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by kyuan on 2017/7/7.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void test_findAllMessage(){
        List<Message> list = messageService.findAllMessage();
        assertThat(1).isEqualTo(list.size());
    }

    @Test
    @Transactional
    @Rollback(true)
    public void test_addMessage(){
        Message msg = new Message();
        msg.setTitle("测试回滚");
        msg.setContent("test");
        msg.setPublisher("kevin test");
        msg.setCreateDate(1);
        msg.setUpdateDate(2);
        messageService.addMessage(msg);
    }

}
