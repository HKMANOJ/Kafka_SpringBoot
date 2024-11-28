package com.example.kafka.controller;

import com.example.kafka.entity.Customer;
import com.example.kafka.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {


    @Autowired
    private KafkaMessagePublisher kafkaMessagePublisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {

        kafkaMessagePublisher.sendMessageToKafkaTopic(message);
        return ResponseEntity.ok("Message published successfully");
    }

    @PostMapping("/publish/customer")
    public ResponseEntity<?> publishMessage(@RequestBody Customer customer) {

        kafkaMessagePublisher.sendMessageToKafkaTopic(customer);
        return ResponseEntity.ok("Message published successfully");
    }

}
