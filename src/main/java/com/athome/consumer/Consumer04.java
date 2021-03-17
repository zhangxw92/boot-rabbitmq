package com.athome.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zhangxw03
 * @Dat 2021-03-17 11:26
 * @Describe
 */
@Component
public class Consumer04 {

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "directceshi", type = ExchangeTypes.DIRECT),
            key = {"info", "warn", "error"})})
    public void reveive(String message) {
        System.out.println("消费者1：" + message);
    }

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "directceshi", type = ExchangeTypes.DIRECT),
            key = {"error"})})
    public void reveive2(String message) {
        System.out.println("消费者2：" + message);
    }
}
