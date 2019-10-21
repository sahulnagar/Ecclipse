package mypack;

import java.util.*;

public class TestBean implements Test{
	private Date date1;
	public void setDate1(Date date1)
	{
		this.date1=date1;
	}
	public void showdate()
	{
		System.out.println("todays date is"+date1);
	}
	


}
