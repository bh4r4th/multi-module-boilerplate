package com.boilerplate.root

import org.springframework.stereotype.Service

@Service
class DemoService {
    fun message():String {
        return "Hello World!"
    }
}
