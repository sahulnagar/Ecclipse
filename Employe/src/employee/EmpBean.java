package employee;

public class EmpBean implements EmpIn {
	private Integer eno;
	private String ename;
	private Float esal;
	
	public void setEno(Integer eno)
	{
		this.eno=eno;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setEsal(Float esal)
	{
		this.esal=esal;
	}
	public void display()
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(esal);
	}

}
