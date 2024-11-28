package com.example.kafka.service;

import com.example.kafka.entity.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumeKafkaListener {

    @KafkaListener(topics = "customer", groupId = "customers_id")
    public void consume(Customer customer) {
        System.out.println("Received message: " + customer.toString());
    }

    @org.springframework.kafka.annotation.KafkaListener(topics = "quickstart-3",groupId = "group_id")
    public void kafkaConsumermessage(String message){
        System.out.println("Consumer consume message"+ "["+message+"]");
    }
}
