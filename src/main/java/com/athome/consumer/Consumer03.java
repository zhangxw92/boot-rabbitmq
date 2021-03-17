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
public class Consumer03 {


    @RabbitListener(bindings = {@QueueBinding(value = @Queue,//不指定队列的名称为临时队列
            exchange = @Exchange(value = "fanoutceshi", type = ExchangeTypes.FANOUT))})
    public void receive(String message) {
        System.out.println("---------" + message);
    }

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,//不指定队列的名称为临时队列
            exchange = @Exchange(value = "fanoutceshi", type = ExchangeTypes.FANOUT))})
    public void receive2(String message) {
        System.out.println("++++++++++" + message);
    }
}
