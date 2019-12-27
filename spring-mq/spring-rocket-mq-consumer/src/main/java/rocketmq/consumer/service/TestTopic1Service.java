package rocketmq.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
//@Service
@RocketMQMessageListener(topic = "test-topic-1", consumerGroup = "my-consumer_test-topic-1")
public class TestTopic1Service implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        log.info("topic: test-topic-1, received message: {}", message);
    }
}
