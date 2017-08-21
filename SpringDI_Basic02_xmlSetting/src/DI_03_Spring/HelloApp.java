package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//컨테이너 구성
		ApplicationContext context=
				new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
		//컨테이너 안 자원 가져오기
		//가져온 자원은 object, 제네릭으로 타입 정의
		MessageBean message=context.getBean("message", MessageBean.class);
		message.sayHello("kglim");
	}
}
