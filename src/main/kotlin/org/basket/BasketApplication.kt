package org.basket

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BasketApplication


fun main(args: Array<String>) {
    SpringApplication.run(BasketApplication::class.java, *args)
}