package exmconst;

public class TestBean  implements Test{
	private Integer esal;
	private String ename;
	private Integer eno;
	
	public TestBean(Integer esal, String ename, Integer eno) {
		super();
		this.esal = esal;
		this.ename = ename;
		this.eno = eno;
	}

	public void show()
	{
		System.out.println("sal is :"+esal+"name is:"+ename+"no is:"+eno);
	}
}
