package com.athome.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zhangxw03
 * @Dat 2021-03-17 11:26
 * @Describe
 */
@Component
public class Consumer02 {

    @RabbitListener(queuesToDeclare = {@Queue(value = "helloWork")})
    public void reveive(String message) {
        System.out.println("消费到的消息1：" + message);
    }

    @RabbitListener(queuesToDeclare = {@Queue(value = "helloWork")})
    public void reveive2(String message) {
        System.out.println("消费到的消息2：" + message);
    }
}
