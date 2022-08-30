package az.developia.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import az.developia.springdemo.config.MyConfig;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context	=SpringApplication.run(SpringdemoApplication.class, args);
	student s=	context.getBean(student.class);
	System.out.println(s.name);
	
	computer c=context.getBean(computer.class);
	System.out.println(c.model);
	MyConfig config=context.getBean(MyConfig.class);
	System.out.println(config.getMyName());
		
//for(String beanName : context.getBeanDefinitionNames()) {
//	System.out.println(beanName);
}
	}


