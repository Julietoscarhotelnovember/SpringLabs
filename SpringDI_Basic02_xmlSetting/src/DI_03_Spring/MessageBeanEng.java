package DI_03_Spring;

public class MessageBeanEng implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name+"!");
	}
}
