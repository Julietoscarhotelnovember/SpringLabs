package AOP_Spring_03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;



public class LogPrintAroundAdvice implements MethodInterceptor  {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("Around Advice Invoke START");
		System.out.println("method : " + method);
		//보조 업무 구현//////////////////////////////
	    Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]"); //console 에 출력
		//////////////////////////////////////////////
		
		//주관심
		Object result = method.proceed();
		
		//보조 업무 구현//////////////////////////////
		sw.stop();
		log.info("[타이머 시작]");
		log.info("[TIME LOG] Method : " + method);
		log.info("[TIME LOG] Process Time : " + sw.getTotalTimeMillis());
		//////////////////////////////////////////////

		return result;
	}

}
