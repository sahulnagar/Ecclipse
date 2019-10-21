package mypack3;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;


public class TestClient {

	public static void main(String[] args)
	{
		Resource resource=new FileSystemResource("Testcfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Test t=(Test)factory.getBean("tn");
		t.display();

	}

}
