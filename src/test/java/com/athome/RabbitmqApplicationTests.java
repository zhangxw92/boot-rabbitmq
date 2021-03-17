package com.athome;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RabbitmqApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //测试点对点模式
    @Test
    void contextLoads() {
        rabbitTemplate.convertAndSend("hello2", "HELLO WORLD33333");
    }

    //测试一个生产者多个消费者work queue模式
    @Test
    public void Test() {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("helloWork", "测试work queue模型" + i);
        }
    }

    //测试广播类型fanout
    @Test
    public void TestFanout() {
        rabbitTemplate.convertAndSend("fanoutceshi", "", "fantoutceshi");
    }

    @Test
    public void TestDirect() {
        rabbitTemplate.convertAndSend("directceshi", "error", "directceshi");
    }

    @Test
    public void TestTopic() {
        rabbitTemplate.convertAndSend("topicceshi", "product.save.aa", "topic模式测试");
    }
}
