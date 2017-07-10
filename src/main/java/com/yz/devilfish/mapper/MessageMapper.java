package com.yz.devilfish.mapper;

import com.yz.devilfish.domain.Message;

import java.util.List;

/**
 * Created by kyuan on 2017/7/6.
 */


public interface MessageMapper {

    List<Message> selectAllMessage();

    Message selectMessageById(int id);

    void insertMessage(Message msg);
}
