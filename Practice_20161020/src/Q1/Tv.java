package Q1;
public class Tv implements Product {
	String product;
	int price;
	double bonuspoint;
	
	@Override
	public Product setInfo(String product, int price, double bonuspoint) {
		this.product=product;
		this.price=price;
		this.bonuspoint=bonuspoint;
		return this;
	}

	@Override
	public String toString() {
		return "Tv [product=" + product + ", price=" + price + ", bonuspoint=" + bonuspoint + "]";
	}
	
	
}
