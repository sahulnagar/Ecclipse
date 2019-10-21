package example2;
import java.util.*;


public class TestBean implements Test{
	private  String ename;
	private Integer esal;
	private Integer eno;
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setEsal(Integer esal)
	{
		this.esal=esal;
	}
	public void setEno(Integer eno)
	{
		this.eno=eno;
	}
	public void display()
	{
		System.out.println("name is:"+ename+"salary is:"+esal+"no is:"+eno);
	}
}
