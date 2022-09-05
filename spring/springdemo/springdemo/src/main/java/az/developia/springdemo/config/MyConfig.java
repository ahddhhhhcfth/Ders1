package az.developia.springdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.springdemo.Ram;
import az.developia.springdemo.computer;

@Configuration
public class MyConfig {
	@Value(value="${myName}")
	private String myName;
	//@Bean
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
public String getMyName() {
	return myName;
}
public void setMyName(String myName) {
	this.myName = myName;
}

}
