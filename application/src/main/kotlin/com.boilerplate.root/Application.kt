package com.boilerplate.root

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = ["com.boilerplate.root"])
@RestController
class Application(private val myService: DemoService) {

    @GetMapping("/")
    fun home(): String {
        return myService.message()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
