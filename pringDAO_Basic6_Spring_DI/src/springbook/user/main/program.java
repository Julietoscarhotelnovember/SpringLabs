package springbook.user.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		//공통 코드(의존성 주입):의존객체
		//UserDao dao = new UserDao(new NConnectionMaker());
		//각 벤더 마다 구현되는 클래스를 달리 하여야 한다
		ApplicationContext context=new GenericXmlApplicationContext("classpath:config.xml");
		UserDao dao=context.getBean("dao", UserDao.class);
				
		User user = new User();
		user.setId("kim");
		user.setName("유신");
		user.setPassword("1004");

		// insert
		dao.add(user);

		System.out.println(user.getId() + "등록성공");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user.getId() + "조회성공");

	}

}
/*
create table users
(
  id varchar2(20) primary key,
  name varchar2(20) not null,
  password varchar2(20) not null
);

*/