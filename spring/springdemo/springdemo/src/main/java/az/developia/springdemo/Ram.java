package az.developia.springdemo;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="ramName")
@Primary
public class Ram {
public int size;
public String brand;
public Ram() {
	brand="Toshiba";
	size=12;
}
}
