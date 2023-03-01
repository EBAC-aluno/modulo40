package dev.pedrolobo.heliosphereAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HeliosphereApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeliosphereApiApplication.class, args);
	}


  @RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
