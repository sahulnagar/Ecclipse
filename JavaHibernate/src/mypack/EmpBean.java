package mypack;
import java.util.*;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmpBean implements Contract
{
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void saveEmployee(Emp e)
	{
		hibernateTemplate.save(e);
	}
	public void updateEmployee(Emp e)
	{
		hibernateTemplate.update(e);
	}
	public void deleteEmployee(Emp e)
	{
		hibernateTemplate.delete(e);
	}
	//public Emp getById(int id)
	//{
	//Emp e=(Emp)hibernateTemplate.get(Emp.class.id);
		//	return e;
		//}
	}


