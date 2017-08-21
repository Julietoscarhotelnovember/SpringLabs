package Q2;

import java.util.Calendar;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;




public class LogPrintAroundAdvice implements MethodInterceptor{

	@Override
	public String invoke(MethodInvocation method) throws Throwable {
		//보조
		Log log = LogFactory.getLog(this.getClass());
		Calendar cal=Calendar.getInstance();
		log.info("금일 날짜 정보: "+cal.getTime());
		
		//주관심
		String result = (String)method.proceed();
		
		//보조
		
		log.info("입력하신 문자열의 길이: "+result.length());
		
		return result;
	}	
}
