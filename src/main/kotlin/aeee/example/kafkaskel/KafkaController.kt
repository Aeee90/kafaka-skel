package aeee.example.kafkaskel

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("/kafka")
class KafkaController(private val producer: KafkaProducer) {

    @PostMapping
    fun sendMessage(@RequestParam message: String) {
        this.producer.sendMessage(message)
    }
}