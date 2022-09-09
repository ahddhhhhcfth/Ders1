package az.myproject.springmvc.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studencontroller {
	
	@GetMapping
	public String showStudents() {
		return "students";
	}

}
