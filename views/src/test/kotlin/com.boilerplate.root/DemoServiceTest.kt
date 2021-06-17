package com.boilerplate.root

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootTest
class DemoServiceTest {

    @Autowired
    private lateinit var myService: DemoService

    @Test
    fun contextLoads() {
        assertThat(myService.message()).isNotNull()
    }

    @SpringBootApplication
    internal class TestConfiguration
}
