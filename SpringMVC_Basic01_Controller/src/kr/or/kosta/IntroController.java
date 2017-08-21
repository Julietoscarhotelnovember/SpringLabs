package kr.or.kosta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IntroController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("IntroController 실행");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","hong");
		mav.setViewName("intro");
		
		return mav;
	}

}
