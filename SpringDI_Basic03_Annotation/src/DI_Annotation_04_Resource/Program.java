package DI_Annotation_04_Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context=new GenericXmlApplicationContext("classpath:DI_Annotation_04/ApplicationContext4.xml");
		MonitorViewer viewer=context.getBean("viewer", MonitorViewer.class);
		System.out.println(viewer.getRecorder());

	}
}
