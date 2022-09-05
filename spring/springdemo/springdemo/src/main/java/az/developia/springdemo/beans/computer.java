package az.developia.springdemo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import az.developia.springdemo.Ram;

@Component
@Primary
@Scope(scopeName = "prototype")
public class computer {
public String model;
@Autowired
@Qualifier(value="myRam")
public Ram ram;
public computer(){
	model="Inspiron";
	System.out.println("computer created");
	
}
@PostConstruct
private void init() {
	System.out.println("init");
}
@PreDestroy

private void destroy() {
	System.out.println("destroy");
		
}


}
}

