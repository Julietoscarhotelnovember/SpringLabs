package AOP_Java_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 * 계산기 프로그램 작성
 * 주 관심사: 연산(더하기, 곱하기, ...)
 * 보조 관심사(공통모듈, 횡단관심사): 연산 작업 시간 확인
 * 							 : log (console red로 출력)
 * 
 * 시작시간(분리필요)
 * 연산
 * 종료시간(분리필요)
 */

public class Cal {
	public int Add(int x, int y){
		Log log=LogFactory.getLog(this.getClass());
		StopWatch sw=new StopWatch();
		
		sw.start();
		log.info("타이머 시작"); //콘솔에 출력
		
		int result=x+y;
		
		sw.stop();
		log.info("타이머 정지");
		log.info("Time log: ADD");
		log.info("걸린 시간: "+sw.getTotalTimeMillis());
		
		return result;
	}
	public int Mul(int x, int y){
		Log log=LogFactory.getLog(this.getClass());
		StopWatch sw=new StopWatch();
		
		sw.start();
		log.info("타이머 시작"); //콘솔에 출력
		
		int result=x*y;
		
		sw.stop();
		log.info("타이머 정지");
		log.info("Time log: Mul");
		log.info("걸린 시간: "+sw.getTotalTimeMillis());
		
		return result;
	}
}
