package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import spring.Client;

public class JavaConfigProtype {
	
	@Bean
	@Scope("prototype")
	public Client client(){
		Client client=new Client();
		client.setHost("webserver");
		return client;
	}
}
