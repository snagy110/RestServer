package snagy.server.rest.controller.mapping

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class ApiController {

    @GetMapping("/")
    fun sayHello() : String {
        return "Hello World! Time on server is ${LocalDateTime.now()}"
    }
}