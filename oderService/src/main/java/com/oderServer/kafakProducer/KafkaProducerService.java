package com.oderServer.kafakProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oderServer.request.RequestPojo;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderEvent(RequestPojo request) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(request);

            kafkaTemplate.send("test-data", json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}