package com.example.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener("pagamentos")
    public void listen(String message) {
        System.out.println("Message received: " + message);
    }
}
