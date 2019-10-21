package mypack;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class MyClient {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("HibernateDemo.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		System.out.println("enter the emp id");
		Integer eno=input.nextInt();
		System.out.println("enter the emp name");
		String ename=input.next();
		System.out.println("enter the emp salary");
		Integer esal=input.nextInt();
		
		Employee employee=new Employee();
		employee.setEno(eno);
		employee.setEname(ename);
		employee.setEsal(esal);
		
		s.save(employee);
		Transaction t=s.beginTransaction();
		t.commit();
		s.close();
		sf.close();
		System.out.println("save");
	

	}

}
