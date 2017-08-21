package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
/*
	<a href="search/internal.do?query=kglim&p=100">internal.do</a><br>
	<a href="search/external.do?query=kglim">internal.do</a><br>
	<a href="search/external.do?p=100">external.do</a><br>
	<a href="search/external.do">external.do</a>
*/
	
	@RequestMapping("/search/internal.do")
	public ModelAndView SearchInternal(@RequestParam("query") String query,
			@RequestParam("p") int pagenumber){
		System.out.println("param value(query): "+query);
		System.out.println("param value(p): "+pagenumber);
		return new ModelAndView("search/internal");
	}
	
	//문제점
	//1.param값이 없는 경우
	//2.param
	
//	방법1
/* @RequestMapping("/search/external.do")
	public ModelAndView searchExternal(@RequestParam(value="query", required=false) String query,
			@RequestParam(value="p", defaultValue="1") int pagenumber){
		System.out.println("param val query: "+query);
		System.out.println("param val pagenum: "+pagenumber);
		return new ModelAndView("search/external");
	}*/
	
/*	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(@RequestParam(value="query", defaultValue="title") String query,
			@RequestParam(value="p", required=false, defaultValue="1") int pagenumber){
		System.out.println("param val query: "+query);
		System.out.println("param val pagenum: "+pagenumber);
		return new ModelAndView("search/external");
	}*/
	
//방법2 제일 간단한 방법
	//넘어오는 파라미터의 이름과 함수 파라미터의 이름을 동일하게
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(String query, String p){
		System.out.println("param val query: "+query);
		System.out.println("param val pagenum: "+p);
		return new ModelAndView("search/external");
	}
}
