import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springbook.user.dao.NConnectionMaker;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

@Configuration
public class config {
	User user;
	@Bean
	public UserDao dao(User user){
		return new UserDao(new NConnectionMaker());
	}
	
}
