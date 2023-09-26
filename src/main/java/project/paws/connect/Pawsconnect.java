package project.paws.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



// revisar mongo
// base de datos mongoDB https://drive.google.com/file/d/1vOdsbRVOh7Bs6wTLwTzKpfoJHkRF2jdC/view
//
@SpringBootApplication
public class Pawsconnect {

	public static void main(String[] args) {
		SpringApplication.run(Pawsconnect.class, args);
	}

}
