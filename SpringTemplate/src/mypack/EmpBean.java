package mypack;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

public class EmpBean implements Contract
{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	public void findRecord(Integer eno)
	{	Object arr[]= {eno};
	List l=	jdbcTemplate.queryForList("select * from emp2 where eno=?",arr);
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
	public int addRecord(Emp emp)
	{
		Object arr[]= {emp.getEno(),emp.getEname(),emp.getEsal()};
		return jdbcTemplate.update("insert into emp2 values(?,?,?)",arr);
		
	}
	public int deleteRecord(Integer eno)
	{
		Object arr[]= {eno};
		return jdbcTemplate.update("delete from emp2 where eno=?",arr);
	}
	public int updateRecord(Emp emp)
	{
		Object arr[]= {emp.getEname(),emp.getEsal(),emp.getEno()};
		return jdbcTemplate.update("update emp2 set ename=?,esal=? where eno=?",arr);
	}
	
		
		
	

}
