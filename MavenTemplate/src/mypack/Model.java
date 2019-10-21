package mypack;

public class Model 
{
	private Integer eno;
	private String ename;
	private Integer esal;
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(Integer esal) {
		this.esal = esal;
	}
	
	public interface model
	{
		void findRecord(Integer eno);
	}
}
