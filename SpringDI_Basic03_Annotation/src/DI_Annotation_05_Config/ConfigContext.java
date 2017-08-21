package DI_Annotation_05_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigContext {
	//<bean id="user" class="...User"></bean>
	@Bean
	public User user(){
		return new User();
	}
	
	@Bean
	public User2 user2(){
		return new User2();
	}
	
}
