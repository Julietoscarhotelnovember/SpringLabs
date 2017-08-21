package Q1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigContext {
	@Bean
	public Buyer buyer(){
		Buyer buyer=new Buyer();
		buyer.insertMoney();
		return buyer;
	}
	
	@Bean
	public Market market(){
		Market market=new Market();
		market.insertProduct(tv());
		return market;
	}
	
	@Bean
	public Tv tv(){
		Tv tv=new Tv();
		return tv;
	}
	
}
