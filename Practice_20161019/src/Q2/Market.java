package Q2;

import org.springframework.beans.factory.annotation.Autowired;

public class Market {
	Ham ham;
	Pizza pizza;
	
	@Autowired
	public void setHam(Ham ham) {
		this.ham = ham;
	}
	@Autowired
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String toString() {
		return "Market [ham=" + ham + ", pizza=" + pizza + "]";
	}
	

}
