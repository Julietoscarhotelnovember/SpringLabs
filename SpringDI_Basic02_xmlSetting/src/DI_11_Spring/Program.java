package DI_11_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_11_Spring/DI_11.xml");
		DatasourceFactory factory=
				context.getBean("dataSourceFactory", DatasourceFactory.class);
		System.out.println(factory.toString());

	}
}
