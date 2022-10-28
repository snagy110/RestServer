package snagy.server.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set

@SpringBootApplication
@Controller
class RestServerApplication

fun main(args: Array<String>) {
	runApplication<RestServerApplication>(*args)

	@GetMapping("/")
	fun sayHello() : String {
		return "Hello World! Time on server is ${LocalDateTime.now()}"
	}
}
