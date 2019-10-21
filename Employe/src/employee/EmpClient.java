package employee;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;


public class EmpClient {

	public static void main(String[] args) {
		Resource resource=new FileSystemResource("Empcfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		EmpIn e=(EmpIn)factory.getBean("tb");
		e.display();
	

	}

}
