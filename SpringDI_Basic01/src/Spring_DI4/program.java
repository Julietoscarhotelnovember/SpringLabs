package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class program {

	public static void main(String[] args) {
		/* 스프링에 다음 코드를 위임
		 * NewRecord record=new NewRecord();
		NewRecord view=new NewRecordView();
		view.setRecord(record);//객체주입
		
		view.input();
		view.print();
		 */
		
		//Spring의 고유한 영역
		//IOC 컨테이너
		ApplicationContext context=
				new ClassPathXmlApplicationContext("DIConfig.xml");
		//컨테이너 생성, xml read
		
		//컨테이너 안에서 필요한 객체를 꺼내 쓰면 됨
		//IOC컨테이너 안에 객체 찾아오기
		RecordView view=(NewRecordView)context.getBean("view");
		view.input();
		view.print();

	}

}
