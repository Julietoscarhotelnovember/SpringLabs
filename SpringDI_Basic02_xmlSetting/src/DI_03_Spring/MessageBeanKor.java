package DI_03_Spring;

public class MessageBeanKor implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 "+name+"!");		
	}
}
