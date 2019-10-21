package mypack;
import java.util.*;
public interface Contract 
{
	void findRecord(Integer eno);
	int addRecord(Emp emp);
	int deleteRecord(Integer eno);
	int updateRecord(Emp emp);
	//List <Emp>findAllRecord();
}
