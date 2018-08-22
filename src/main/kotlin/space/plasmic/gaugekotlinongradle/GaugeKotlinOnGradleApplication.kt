package space.plasmic.gaugekotlinongradle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GaugeKotlinOnGradleApplication

fun main(args: Array<String>) {
    runApplication<GaugeKotlinOnGradleApplication>(*args)
}
