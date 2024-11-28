package com.example.kafka.configure;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfigure {

    @Bean
    public NewTopic createTopic() {
        return new NewTopic("customer", 5, (short) 1);
    }
}
