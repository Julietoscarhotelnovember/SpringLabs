package Q2;

public class Pizza extends Food {
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
		return "Pizza [name=" + name + ", price=" + price + "]";
	}
	
}
