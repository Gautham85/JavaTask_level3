package kafka_services;

import mongodb.testing.models.StudentDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;

@Controller
public class producer {
    private static final Logger LOGGER= LoggerFactory.getLogger(producer.class);

    private KafkaTemplate<String, StudentDetails> kafkaTemplate;

    public producer(KafkaTemplate<String,StudentDetails> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(StudentDetails s){
        LOGGER.info(String.format("Message sent -> %s", s));

        Message<StudentDetails> message = MessageBuilder.withPayload(s).setHeader(KafkaHeaders.TOPIC,"DemoTopic").build();

        kafkaTemplate.send(message);
    }
}