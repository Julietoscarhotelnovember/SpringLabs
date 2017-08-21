package Q1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new GenericXmlApplicationContext("classpath:Q1/ApplicationContext.xml");
		
		ElectronicStore electronicStore=context.getBean("electronicStore", ElectronicStore.class);

		System.out.println(electronicStore.toString());

	}

}
