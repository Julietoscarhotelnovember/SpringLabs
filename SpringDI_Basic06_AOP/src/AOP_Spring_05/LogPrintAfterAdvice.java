package AOP_Spring_05;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogPrintAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnvalue, Method method, Object[] args, Object target) throws Throwable {
		Log log=LogFactory.getLog(this.getClass());
		log.info("afterreturning advice start");
		log.info("주업무 실행 후 돌아와서 바로 실행");
		log.info("returnvalue: "+returnvalue);
		log.info("method: "+method.getName());
		log.info("args: "+Arrays.toString(args));
		log.info("target: "+target.toString());
		
	}

}
