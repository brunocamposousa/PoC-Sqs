package com.example.sqs.producer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/sqs")
public class MyProducer {

	@Autowired
	private SqsTemplate sqsTemplate;    

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        var SQS = "https://sqs.us-east-1.amazonaws.com/214933884761/pagamentos";
        sqsTemplate.send(SQS, message);
        return ResponseEntity.ok("Message sent to SQS successfully!");
    }
    
}
