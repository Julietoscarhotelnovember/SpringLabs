package DI_07_Spring;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI_06_Spring.WriteArticleService;

public class Program {

	public static void main(String[] args) {
		/*ArrayList<MyFilter> arraylist=new ArrayList<MyFilter>();
		arraylist.add(new ZipFilter());
		arraylist.add(new HeaderFilter());
		arraylist.add(new EncFilter());
		
		ProtocolHandler ph=new ProtocolHandler();
		ph.setFilters(arraylist);*/
		
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_07_Spring/DI_07.xml");
		
		ProtocolHandler ph=context.getBean("protocolHandler", ProtocolHandler.class);
		System.out.println(ph.Filter_length());

	}
}
