package az.developia.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import az.developia.springdemo.Ram;

@Component
@Primary
public class computer {
public String model;
@Autowired
@Qualifier(value="myRam")
public Ram ram;
public computer(){
	model="Inspiron";
	
	
}
}
