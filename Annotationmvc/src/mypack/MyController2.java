package mypack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController2
{

	@RequestMapping("/add")
	public String process ()  
	{
		
		return "display1";
	}

}
