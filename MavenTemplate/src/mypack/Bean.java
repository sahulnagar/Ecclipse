package mypack;
import java.util.List;
import java.util.*;
import java.util.Iterator;

import org.springframework.jdbc.core.JdbcTemplate;

public class Bean implements model
{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void findRecord(Integer eno)
	{
		Object arr[]= {eno};
		List l=jdbcTemplate.queryForList("select * from emp2 where eno=?",arr);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
