package mypack;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bean 
{
	@Autowired
	private Date date;
	public void showDetail()
	{
		System.out.println(date);
	}

}
