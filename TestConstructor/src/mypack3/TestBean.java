package mypack3;

public class TestBean  implements Test
{
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void display()
	{
		System.out.println("name is:"+empName);
	}

}
