package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	//코드에서 response, request가 필요하면 함수의 파라미터에서 구현하고 사용할 것
	
	@RequestMapping("cookie/make.do")
	public String make(HttpServletResponse response){
		response.addCookie(new Cookie("auth", "1004"));
		return "cookie/CookieMake";
	}
	
	@RequestMapping("cookie/view.do")
	public String view(@CookieValue(value="auth", defaultValue="0") String authcookie){
		System.out.println("클라이언트에서 read한 쿠키값: "+authcookie);
		return "cookie/CookieView";
	}
}
