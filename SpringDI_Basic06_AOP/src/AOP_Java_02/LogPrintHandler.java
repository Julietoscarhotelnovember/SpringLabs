package AOP_Java_02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandler implements InvocationHandler {
//가짜를 만들어서 진짜처럼 사용: java reflect InvocationHandler
//가짜 객체를 만들어서 위 아래에 보조관심사 메서드를 끼워넣어야 한다 > proxy
//보조 > invoke > 원래주소 > invoke > 보조
//InvocationHandler 대리함수 역할
	
	private Object target;
	public LogPrintHandler(Object target) {
		System.out.println("Log Print Handler 보조관심사 생성자");
		this.target=target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke 메서드 호출 시작");
		//System.out.println("proxy: "+proxy);
		System.out.println("method: "+method);
		System.out.println("object[] args: "+Arrays.toString(args));
		
		//보조관심사
		Log log=LogFactory.getLog(this.getClass());
		StopWatch sw=new StopWatch();
		sw.start();
		log.info("타이머 시작"); //콘솔에 출력
		
		//주업무
		//invoke가 실제 메서드 add, mul, sub 호출
		int result=(int)method.invoke(this.target, args); //이거는 위와 다른 invoke이다
		
		//보조관심사
		sw.stop();
		log.info("타이머 정지");
		log.info("Time log: ADD");
		log.info("걸린 시간: "+sw.getTotalTimeMillis());
		
		return result;
	}
}
