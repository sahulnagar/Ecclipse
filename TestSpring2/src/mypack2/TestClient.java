package mypack2;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class TestClient
{

	public static void main(String[] args) 
	{
		Resource resource=new FileSystemResource("testcfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		test t=(test)factory.getBean("tb");
		t.showData();
	

	}

}
