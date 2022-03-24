package aeee.example.kafkaskel

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(
    private val kafkaTemplate: KafkaTemplate<String, String>
) {

    companion object {
        const val TOPIC = "example"
    }

    fun sendMessage(message: String) {
        println("Produce message: $message")
        this.kafkaTemplate.send(TOPIC, message)
    }
}