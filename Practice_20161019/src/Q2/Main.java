package Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:Q2/ApplicationContext.xml");
		Ham ham=context.getBean("ham", Ham.class);
		Pizza pizza=context.getBean("pizza", Pizza.class);
		Market market=context.getBean("market", Market.class);
		
		System.out.println(ham.toString());
		System.out.println(pizza.toString());
		System.out.println(market.toString());

	}

}
