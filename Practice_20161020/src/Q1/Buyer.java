package Q1;
import java.util.Scanner;

public class Buyer {
	int money;
	void insertMoney(){

		Scanner scan=new Scanner(System.in);
		System.out.print("금액 입력: ");
		this.money=Integer.parseInt(scan.nextLine());
		System.out.println("구매자가 가진 금액: "+this.money);
	}
}
