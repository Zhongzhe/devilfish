package com.yz.devilfish.web;

import com.yz.devilfish.MainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by kyuan on 2017/7/7.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = MainApplication.class)
public class MessageControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_getAllMessage(){
        String body = this.restTemplate.getForObject("/message/test",String.class);
        assertThat(body).isNotEmpty();
    }

    @Test
    public void test_addMessage(){

    }


}
