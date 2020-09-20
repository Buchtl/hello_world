package de.infschauer.helloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController  {
    @GetMapping("/")
    fun sayHello(): String {
        return "Hello there ..."
    }
}