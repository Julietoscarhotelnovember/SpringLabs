package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//@Controller 클래스 안에 있는 함수 단위로  url mapping 가능
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		System.out.println("hello.do 시작");
		ModelAndView mv=new ModelAndView();
		mv.addObject("greeting", getGreeting());
		mv.setViewName("hello");
		return mv;
	}
	private String getGreeting(){
		int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour>=6 && hour<=10){
			return "아침";
		}else if(hour>=11 && hour<=13){
			return "배고픔";
		}else if(hour>=14){
			return "개졸림";
		}else{
			return "집가";
		}
	}

}
