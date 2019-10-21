package mypack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController1 
{

	@RequestMapping("/update")
	public String process () 
	{
		
		return "display";
	}

}
