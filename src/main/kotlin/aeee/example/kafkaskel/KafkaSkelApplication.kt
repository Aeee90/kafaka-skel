package aeee.example.kafkaskel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSkelApplication

fun main(args: Array<String>) {
	runApplication<KafkaSkelApplication>(*args)
}
