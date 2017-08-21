package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;

public class MainPrototype {

	public static void main(String[] args) {
		GenericXmlApplicationContext context=
				new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		//원래는 이때 bean을 만들어 놓지만,
		//prototype에서는 getbean 할 때 객체 만든다
		Client client=context.getBean("client", Client.class);
		Client client2=context.getBean("client", Client.class);
		
		System.out.println(client.toString());
		System.out.println(client2.toString());
		
		//context.close();

	}

}
