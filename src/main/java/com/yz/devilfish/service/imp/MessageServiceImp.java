package com.yz.devilfish.service.imp;

import com.yz.devilfish.domain.Message;
import com.yz.devilfish.mapper.MessageMapper;
import com.yz.devilfish.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kyuan on 2017/7/7.
 */
@Service
public class MessageServiceImp implements MessageService{

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> findAllMessage() {
        return messageMapper.selectAllMessage();
    }

    @Override
    public void addMessage(Message msg) {
        messageMapper.insertMessage(msg);
        int i = 4/0;
    }
}
