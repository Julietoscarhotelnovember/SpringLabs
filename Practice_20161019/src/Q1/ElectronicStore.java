package Q1;
import org.springframework.beans.factory.annotation.Autowired;

public class ElectronicStore {
	ProductList productlist;
	CustomerList customerlist;
	
	@Autowired
	public void setProductlist(ProductList productlist) {
		this.productlist = productlist;
	}
	
	@Autowired
	public void setCustomerlist(CustomerList customerlist) {
		this.customerlist = customerlist;
	}

	@Override
	public String toString() {
		return "ElectronicStore [productlist=" + productlist + ", customerlist=" + customerlist + "]";
	}
}
