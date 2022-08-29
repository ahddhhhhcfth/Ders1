package az.developia.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context	=SpringApplication.run(SpringdemoApplication.class, args);
	student s=	context.getBean(student.class);
	System.out.println(s.name);
		
//for(String beanName : context.getBeanDefinitionNames()) {
//	System.out.println(beanName);
}
	}


