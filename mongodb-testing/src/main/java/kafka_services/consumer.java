package kafka_services;

import mongodb.testing.models.StudentDetails;
import mongodb.testing.rep.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

@Controller
public class consumer {
    @Autowired
    private StudentRepository studentRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(consumer.class);
    @KafkaListener(topics = "DemoTopic", groupId = "kafka-group")
    public void listenToCodeDecodeKafkaTopic(StudentDetails s) {
        LOGGER.info("message Recieved -> " + s);
        studentRepository.save(s);


    }
}