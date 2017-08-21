package Q2;

import java.util.Scanner;

public class StringOutput implements Output {

	@Override
	public String strout() {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.nextLine();
		
		return str;
	}

}
