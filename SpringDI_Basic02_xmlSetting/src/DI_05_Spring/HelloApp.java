package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*MyBean mybean=new MyBean();
		MyBean mybean2=new MyBean("kglim");
		Singleton single=Singleton.getInstance();
		Singleton single2=Singleton.getInstance();
		System.out.println("mybean"+mybean);
		System.out.println("mybean2"+mybean2);
		System.out.println("single"+single);
		System.out.println("single2"+single2);*/
		
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		
		System.out.println("mybean객체 생성 이전");
		MyBean mybean=context.getBean("mybean", MyBean.class);
		System.out.println("주소: "+mybean);
		
		System.out.println("mybean2객체 생성 이전");
		MyBean mybean2=context.getBean("mybean", MyBean.class);
		System.out.println("주소: "+mybean2);
		
	}

}

