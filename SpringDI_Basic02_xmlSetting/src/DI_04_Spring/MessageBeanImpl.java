package DI_04_Spring;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	
	
	public MessageBeanImpl(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println(this.name+" / "+this.getGreeting());
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
