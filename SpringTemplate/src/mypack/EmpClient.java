package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.*;

public class EmpClient {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		ApplicationContext ac=new FileSystemXmlApplicationContext("EmpCfg.xml");
		Contract c=(Contract)ac.getBean("e");
		System.out.println("PRESS 1 FOR FIND");
		System.out.println("PRESS 2 FOR INSERT");
		System.out.println("PRESS 3 FOR DELETE");
		System.out.println("PRESS 4 FOR UPDATE");
	
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
		case 2:
		{
			System.out.println("enter the emp no");
			Integer eno=in.nextInt();
			System.out.println("enter the emp name");
			String ename=in.next();
			System.out.println("enter the emp salary");
			Integer esal=in.nextInt();
			
			Emp emp=new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			
			int x=c.addRecord(emp);
			System.out.println(x+"record added");
			break;
		}
		case 3:
		{
			System.out.println("enter the emp non");
			Integer eno=in.nextInt();
			
			c.deleteRecord(eno);
			break;
		}
		case 4:
		{
			System.out.println("enter the emp no");
			Integer eno=in.nextInt();
			System.out.println("enter the emp name");
			String ename=in.next();
			System.out.println("enter the emp sal");
			Integer esal=in.nextInt();
			Emp emp=new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			
			int y=c.updateRecord(emp);
			System.out.println(y+"record updated");
			break;
			
		}
		
		
	}

	}
}
