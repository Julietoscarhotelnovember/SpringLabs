package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.Client;

public class Program {

	public static void main(String[] args) {
		/*Client client=new Client("192.168.0.115");
		client.setHost("192.198.1.1");*/
		//인터페이스에는 close가 없어서 이렇게 받음
		GenericXmlApplicationContext context=
				new GenericXmlApplicationContext("classpath:ApplicationContext.xml");
		Client client=context.getBean("client", Client.class);
		client.send();
		
		context.close();

	}

}
