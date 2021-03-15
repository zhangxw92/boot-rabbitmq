package com.athome.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queuesToDeclare = @Queue(value = "hello2"))
public class consumer01 {

    @RabbitHandler
    public void reveive(String message) {
        System.out.println("---------" + message);
    }
}
