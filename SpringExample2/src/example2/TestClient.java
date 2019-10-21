package example2;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;



public class TestClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("Testcfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Test t=(Test)factory.getBean("tb");
		t.display();

	}

}
