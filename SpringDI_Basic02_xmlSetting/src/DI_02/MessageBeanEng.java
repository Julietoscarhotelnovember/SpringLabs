package DI_02;

public class MessageBeanEng implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name+"!");
	}
}
