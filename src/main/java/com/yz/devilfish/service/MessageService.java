package com.yz.devilfish.service;

import com.yz.devilfish.domain.Message;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kyuan on 2017/7/7.
 */
@Component
public interface MessageService {

    List<Message> findAllMessage();

    @Transactional
    void addMessage(Message msg);


}
