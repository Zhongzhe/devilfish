package com.yz.devilfish.domain;

import org.springframework.stereotype.Component;

/**
 * Created by kyuan on 2017/7/6.
 */
public class Message {

    //资讯标题
    public String title;
    //资讯内容
    public String message;
    //发布人
    public String publisher;
    //发布时间
    public int createDate;
    //更新时间
    public int updateDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCreateDate() {
        return createDate;
    }

    public void setCreateDate(int createDate) {
        this.createDate = createDate;
    }

    public int getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(int updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Message的标题:"+title+"\n"
                +"内容:"+message+"\n"
                +"发布人:"+publisher+"\n"
                +"发布时间:"+createDate;
    }
}
