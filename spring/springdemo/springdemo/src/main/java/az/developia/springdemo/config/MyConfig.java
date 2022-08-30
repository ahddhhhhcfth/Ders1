package az.developia.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.developia.springdemo.Ram;
import az.developia.springdemo.computer;

@Configuration
public class MyConfig {
	
	@Bean
	public computer myComputer() {
		computer c=new computer();
		c.model="G62";
		return c;
	}
@Bean
public Ram myRam() {
	Ram r=new Ram();
	r.size=24;
	r.brand="HP";
	return r;
}
}
