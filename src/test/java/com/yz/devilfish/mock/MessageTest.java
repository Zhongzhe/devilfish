package com.yz.devilfish.mock;

import com.yz.devilfish.domain.Message;
import com.yz.devilfish.service.MessageService;
import com.yz.devilfish.web.MessageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by kyuan on 2017/7/7.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(MessageController.class)
public class MessageTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MessageService messageService;

    @Test
    public void testMessage() throws Exception{
        given(this.messageService.findAllMessage())
                .willReturn(new ArrayList<Message>());

        this.mvc.perform(get("/message/all").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().encoding("UTF-8"));
                //.andExpect(content().string("hello world"));

    }
}
