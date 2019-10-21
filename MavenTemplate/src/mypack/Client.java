package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.*;

public class Client 
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ApplicationContext ac=new FileSystemXmlApplicationContext("Cfg.class");
		Model c=(Model)ac.getBean("e");
		
		System.out.println("enter your choice");
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
			{
				System.out.println("enter the emp no");
				Integer eno=in.nextInt();
				c.findRecord(eno);
				break;
			}

	}

}
