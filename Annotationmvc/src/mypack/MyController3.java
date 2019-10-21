package mypack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
class MyController3 
{
	@RequestMapping("/delete")
	public String process()
	{
		return "display3";
	}
	

}
