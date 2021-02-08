package com.gabrielduarte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableFeignClients
@SpringBootApplication
public class UserEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserEventApplication.class, args);
    }
}
