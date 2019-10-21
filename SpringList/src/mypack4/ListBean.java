package mypack4;
import java.util.*;

public class ListBean implements TestList {
	private List faculities;
	
	public List getFaculities() {
		return faculities;
	}

	public void setFaculities(List faculities) {
		this.faculities = faculities;
	}

	public void show()
	{
		System.out.println(faculities);
	}

}
