package com.atguigu.boot.activemq.topic.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 15:29
 */
@Component
public class Topic_Consumer {

    @JmsListener(destination = "${mytopic}")
    public void receiveTopicMsg(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到订阅的 Topic 消息："+textMessage.getText());
    }
}
