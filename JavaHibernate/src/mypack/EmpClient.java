package mypack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import java.util.*;

public class EmpClient 
{

	public static void main(String[] args) 
	
	{
		Resource r=new FileSystemResource("EmpCfg.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		EmpBean  bean=(EmpBean)factory.getBean("d");
		Scanner in=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("select 1 for save employee record");
		System.out.println("select 2 for update employee record");
		System.out.println("select 3 for delete employee record");
		System.out.println("select 4 for find employee record");
		Integer choice=in.nextInt();
		switch(choice)
		{
		
		case 1:
		{
		System.out.println("enter the eno");
		Integer eno=in.nextInt();
		System.out.println("enter the ename");
		String ename=in.next();
		System.out.println("enter the esal");
		Integer esal=in.nextInt();
		
		Emp e=new Emp();
		e.setEno(eno);
		e.setEname(ename);
		e.setEsal(esal);
		bean.saveEmployee(e);
		break;
		}
		case 2:
		{
			
			System.out.println("enter the ename");
			String ename=in.next();
			System.out.println("enter the esal");
			Integer esal=in.nextInt();
			System.out.println("enter the eno");
			Integer eno=in.nextInt();
			Emp e=new Emp();
			e.setEname(ename);
			e.setEsal(esal);
			e.setEno(eno);
			bean.updateEmployee(e);
			break;
		}
		case 3:
		{
			System.out.println("enter the eno");
			Integer eno=in.nextInt();
			Emp e=new Emp();
			e.setEno(eno);
			bean.deleteEmployee(e);
		}
		/*case 4:
		{
			System.out.println("enter the no do you want to find");
			Integer eno=in.nextInt();
			Emp e1=bean.getById(eno);
			System.out.println(e1.getEno()+""+e1.getEname()+""+e1.getEsal());
		}*/
			
	}
	}
}
		
		
	

