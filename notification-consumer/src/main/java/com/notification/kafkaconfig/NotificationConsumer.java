package com.notification.kafkaconfig;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "test-data", groupId = "notification-group2")
    public void consume(String message) {
        System.out.println("📢 Notification Received: " + message);
    }
}