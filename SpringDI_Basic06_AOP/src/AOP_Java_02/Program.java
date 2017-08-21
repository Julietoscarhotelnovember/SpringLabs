package AOP_Java_02;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		Calc calc=new NewCalc();
		//System.out.println(calc.ADD(10, 20)); 주 업무 직접 실행
		
		Calc proxyCalc=(Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실제(주업무) 클래스 메타 정보
							   calc.getClass().getInterfaces(), //행위정보(인터페이스)
							   new LogPrintHandler(calc)); //핸들러(보조관심): 실객체의 주소 넘김
		int result=proxyCalc.ADD(100, 200);
		System.out.println(result);
	}

}
