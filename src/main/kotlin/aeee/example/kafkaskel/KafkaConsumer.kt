package aeee.example.kafkaskel

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    @KafkaListener(topics = [KafkaProducer.TOPIC], groupId = "aeee")
    fun consume(message: String) {
        println("Consumed message: $message")
    }
}