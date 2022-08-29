package az.developia.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.developia.springdemo.computer;

@Configuration
public class MyConfig {
	
	@Bean
	public computer myComputer() {
		computer c=new computer();
		c.model="G62";
		return c;
	}

}
