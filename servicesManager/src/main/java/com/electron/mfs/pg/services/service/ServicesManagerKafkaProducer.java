package com.electron.mfs.pg.services.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServicesManagerKafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(ServicesManagerKafkaProducer.class);
    private static final String TOPIC = "topic_servicesmanager";

    private KafkaTemplate<String, String> kafkaTemplate;

    public ServicesManagerKafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info("Producing message to {} : {}", TOPIC, message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}
