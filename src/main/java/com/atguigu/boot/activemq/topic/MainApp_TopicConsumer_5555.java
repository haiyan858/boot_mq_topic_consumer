package com.atguigu.boot.activemq.topic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 模拟两个消费者订阅消息，先启动订阅者，再启动发布者
 *
 * @Author cuihaiyan
 * @Create_Time 2019-07-12 15:26
 */
@SpringBootApplication
public class MainApp_TopicConsumer_5555 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp_TopicConsumer_5555.class, args);
    }

}
