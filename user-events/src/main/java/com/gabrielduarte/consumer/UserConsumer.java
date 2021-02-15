package com.gabrielduarte.consumer;

import com.gabrielduarte.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserConsumer {
//created character consumer - nome do que aconteceu
    @Value("${topic.name.consumer}")
    private String topicName;

    private final UserService userService;

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "user-events")
    public void consume(ConsumerRecord<String, String> message) {
        //log
        userService.saveOrUpdate(message.value());
    }

}
