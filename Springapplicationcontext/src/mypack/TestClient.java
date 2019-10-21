package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("Testcfg1.xml");
		Test t=(Test)ac.getBean("db");
		t.display();

	}

}
