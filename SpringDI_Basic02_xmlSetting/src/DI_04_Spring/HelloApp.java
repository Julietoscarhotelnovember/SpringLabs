package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*MessageBeanImpl messagebean=new MessageBeanImpl("kglim");
		messagebean.setGreeting("hello");*/
		
		//xml설정을 통해 IOC 컨테이너 구성
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
		//컨테이너 안의 객체 얻어오기
		MessageBean messagebean=context.getBean("m1", MessageBean.class);
		
		messagebean.sayHello();
	}
}
