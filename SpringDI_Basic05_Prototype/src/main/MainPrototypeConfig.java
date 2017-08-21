package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfigProtype;
import spring.Client;

public class MainPrototypeConfig {

	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(JavaConfigProtype.class);
		Client client=context.getBean("client", Client.class);
		Client client2=context.getBean("client", Client.class);
		
		System.out.println(client.toString());
		System.out.println(client2.toString());

	}

}
