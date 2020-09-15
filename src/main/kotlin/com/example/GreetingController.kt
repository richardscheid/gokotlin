package com.example

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@RestController
class GreetingController {
	val counter = AtomicLong()

	@GetMapping("/greeting")
	fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
		Greeting(counter.incrementAndGet(), "Hello, $name")

}

data class Greeting(val id: Long, val content: String)