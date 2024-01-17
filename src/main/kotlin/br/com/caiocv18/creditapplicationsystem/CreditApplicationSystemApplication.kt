package br.com.caiocv18.creditapplicationsystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class CreditApplicationSystemApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(CreditApplicationSystemApplication::class.java, "--server.port=8080", *args)
        }
    }
}

@RestController
@RequestMapping("/home")
class HomeController {

    companion object {
        const val WELCOME_MESSAGE = "Welcome to Home Page!"
    }

    @GetMapping
    fun home(): String {
        return WELCOME_MESSAGE
    }
}