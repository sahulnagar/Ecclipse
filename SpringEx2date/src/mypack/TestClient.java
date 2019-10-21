package mypack;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;



public class TestClient {

	public static void main(String[] args) {
		Resource resource1=new ClassPathResource("Testcfg1.xml");
		Resource resource=new ClassPathResource("Testcfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		BeanFactory factory1=new XmlBeanFactory(resource1);
		Test t=(Test)factory.getBean("dl");
		t.showdate();
		

	}

}
