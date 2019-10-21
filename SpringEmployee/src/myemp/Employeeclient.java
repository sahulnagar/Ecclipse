package myemp;
import java.util.*;
import java.sql.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Employeeclient {

	public static void main(String[] args) throws Exception
	{	
		ApplicationContext ac=new FileSystemXmlApplicationContext("Emp.xml");
		Construct c=(Construct)ac.getBean("eb");
		System.out.println("PRESS 1 FOR INSERT");
		System.out.println("PRESS 2 FOR UPDATE");
		System.out.println("PRESS 3 FOR DELETE");
	
		System.out.println("enter your choice");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice)
		{
		case 1:
			{
		
				System.out.println("enter the emp no");
				Integer eno=in.nextInt();
				System.out.println("enter the emp name");
				String ename=in.next();
				System.out.println("enter the salary");
				Integer esal=in.nextInt();
				employee e=new employee();
				e.setEno(eno);
				e.setEname(ename);
				e.setEsal(esal);
		
				int x=c.addRecord(e);
				System.out.println(x+"record added succesfully");
				break;
			}
		case 2:
		{
			System.out.println("enter the emp no");
			Integer eno=in.nextInt();
			System.out.println("enter the emp name");
			String ename=in.next();
			System.out.println("enter the salary");
			Integer esal=in.nextInt();
			employee e=new employee();
			e.setEno(eno);
			e.setEname(ename);
			e.setEsal(esal);
			System.out.println("record updated succesfully");
			break;
		}
		case 3:
		{
			System.out.println("enter the emp no");
			Integer eno=in.nextInt();
			employee e=new employee();
			e.setEno(eno);
			System.out.println("record deleted succesfully");
			break;
		}
	}
}
}


