package mypack;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class MyClient 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("HibernateAll.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for insert data");
		System.out.println("Enter 2 for update data");
		System.out.println("Enter 3 for delete data");
		System.out.println("Enter 4 for select data");
		
		Integer choice=input.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("enter the employee id");
			Integer eno=input.nextInt();
			System.out.println("enter the employee name");
			String ename=input.next();
			System.out.println("enter the employee salary");
			Integer esal=input.nextInt();
			
			Employee employee=new Employee();
			employee.setEno(eno);
			employee.setEname(ename);
			employee.setEsal(esal);
			s.save(employee);
			
			Transaction t=s.beginTransaction();
			t.commit();
			sf.close();
			s.close();
			System.out.println("record added");

			break;
		}
		case 2:
		{
			System.out.println("enter the employee id");
			Integer eno=input.nextInt();
			System.out.println("enter the employee name");
			String ename=input.next();
			System.out.println("enter the employee salary");
			Integer esal=input.nextInt();
			
			Employee employee=new Employee();
			employee.setEno(eno);
			employee.setEname(ename);
			employee.setEsal(esal);
			s.update(employee);
			Transaction t=s.beginTransaction();
			t.commit();
			sf.close();
			s.close();
			
			System.out.println("record updated");
			break;
			
		}
		case 3:
		{
			System.out.println("enter the employee id");
			Integer eno=input.nextInt();
			
			Employee employee=new Employee();
			employee.setEno(eno);
		    s.delete(employee);
		    Transaction t=s.beginTransaction();
			t.commit();
			sf.close();
			s.close();
			System.out.println("record deleted");
			break;
		}
		case 4:
		{
			System.out.println("enter the employee id");
			Integer eno=input.nextInt();

			Employee employee=(Employee)s.load(Employee.class,eno);
			System.out.println("name is:"+employee.getEname());
			System.out.println("salary is:"+employee.getEsal());
			Transaction t=s.beginTransaction();
			t.commit();
			sf.close();
			s.close();
			break;
			
		}
			}
		
	}

}
