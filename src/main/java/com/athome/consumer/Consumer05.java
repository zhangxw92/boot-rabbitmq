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
public class Consumer05 {

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "topicceshi", type = ExchangeTypes.TOPIC),
            key = {"order.*", "product.#", "user.*"})})
    public void reveive(String meg) {
        System.out.println("消费者一：" + meg);
    }

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "topicceshi", type = ExchangeTypes.TOPIC),
            key = {"order.*",})})
    public void reveive2(String meg) {
        System.out.println("消费者二：" + meg);
    }

    @RabbitListener(bindings = {@QueueBinding(value = @Queue,
            exchange = @Exchange(value = "topicceshi", type = ExchangeTypes.TOPIC),
            key = {"product.#",})})
    public void reveive3(String meg) {
        System.out.println("消费者三：" + meg);
    }
}
