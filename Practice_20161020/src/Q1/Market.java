package Q1;
import java.util.Scanner;

public class Market {

	void insertProduct(Product product){
		
		Scanner scan=new Scanner(System.in);
		System.out.print("상품명 입력: ");
		String p1=scan.nextLine();
		System.out.print("가격 입력: ");
		int p2=Integer.parseInt(scan.nextLine());

		product.setInfo(p1, p2, p2*0.1f);
		System.out.println(product.toString());
	}
}
