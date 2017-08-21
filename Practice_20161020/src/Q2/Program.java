package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Program {

	public static void main(String[] args) {
		ApplicationContext context=new GenericXmlApplicationContext("classpath:Q2/ApplicationContext.xml");

		Output output=(Output)context.getBean("proxy");
		System.out.println("입력값: "+output.strout());
				
	}

}
