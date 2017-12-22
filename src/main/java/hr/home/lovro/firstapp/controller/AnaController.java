package hr.home.lovro.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnaController {

	@GetMapping("/home/ana")
    public String index() {
        return "Greetings from Spring Boot! BTW, Ana.";
    }
	
}
