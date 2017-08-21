package DI_09_Spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*ProtocolHandlerFactory factory=new ProtocolHandlerFactory();
		
		Map<String, ProtocolHandler> map=new HashMap<String, ProtocolHandler>();
		map.put("rest", new RestHandler());
		map.put("Rss", new RssHandler());
		
		factory.setHandlers(map);*/
		
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_09_Spring/DI_09.xml");

	}
}
