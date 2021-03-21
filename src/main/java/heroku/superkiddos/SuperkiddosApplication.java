package heroku.superkiddos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SuperkiddosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperkiddosApplication.class, args);
	}

}

@RestController
class HelloController{
	@GetMapping("/")
	String hello(){
		return "Hola Mundo 3";
	}
}