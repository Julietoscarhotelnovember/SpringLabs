package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean meeagebean1=new MessageBeanEng();
		meeagebean1.sayHello("kglim");
		MessageBean meeagebean2=new MessageBeanKor();
		meeagebean2.sayHello("kglim");
	}
}
//요구사항
//MessageBean
//영문버전(Hello kglim!), 한글버전(안녕 kglim!)
