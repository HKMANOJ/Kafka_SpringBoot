package com.example.kafka.service;
import com.example.kafka.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.kafka.support.SendResult;
import java.util.concurrent.CompletableFuture;


@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> template;

    public void sendMessageToKafkaTopic(String message) {

        CompletableFuture<SendResult<String, Object>> future = template.send("quickstart-3", message);

            future.whenComplete((result,ex)->
            {
                if(ex!=null){
                    System.out.println("Unable to send message=["
                            + message + "] due to : " + ex.getMessage());
                }else{
                    System.out.println("Sent Message["+message +"]"+ " "+" with a offset=["+result.getRecordMetadata().offset()+"]" +" "+result.getRecordMetadata().partition() );
                }
            });
    }

    public void sendMessageToKafkaTopic(Customer customer) {

        CompletableFuture<SendResult<String, Object>> future = template.send("customer", customer);

        future.whenComplete((result,ex)->
        {
            if(ex!=null){
                System.out.println("Unable to send message=["
                        + customer.toString() + "] due to : " + ex.getMessage());
            }else{
                System.out.println("Sent Message["+customer.toString() +"]"+ " "+" with a offset=["+result.getRecordMetadata().offset()+"]" +" "+result.getRecordMetadata().partition() );
            }
        });
    }

}
