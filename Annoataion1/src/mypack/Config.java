package mypack;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages= {"mypack"})
public class Config
{
	@Bean
	public Date getObject()
	{
		return new Date();
	}

}
