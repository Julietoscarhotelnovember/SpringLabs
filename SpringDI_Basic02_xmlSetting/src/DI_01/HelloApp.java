package DI_01;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean meeagebean=new MessageBean();
		meeagebean.sayHello("kglim");
	}
}
//요구사항
//MessageBean
//영문버전(Hello kglim!), 한글버전(안녕 kglim!)
