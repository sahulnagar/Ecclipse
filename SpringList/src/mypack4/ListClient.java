package mypack4;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;




public class ListClient {

	public static void main(String[] args) 
	{	Resource resource=new FileSystemResource("Listcfg.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	TestList t=(TestList)factory.getBean("tl");
	t.show();
		

	}

}
