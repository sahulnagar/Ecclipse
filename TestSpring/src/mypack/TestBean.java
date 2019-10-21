package mypack;

public class TestBean implements Test
	{
		private String empName;
		public void setEmpName(String empName)
		{
			this.empName=empName;
		}
		public void showData()
				{
					System.out.println(empName);
				}
	}

