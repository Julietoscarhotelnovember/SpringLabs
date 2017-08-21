package Q2;

public class Ham extends Food {
	String name;
	int price;
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ham [name=" + name + ", price=" + price + "]";
	}
	
}
