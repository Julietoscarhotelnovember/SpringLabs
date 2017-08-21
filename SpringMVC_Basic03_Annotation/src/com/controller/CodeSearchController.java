package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.SearchType;

/*
 * @ModelAttribute 사용법
 * 
 * 1.public String submit(@ModelAttribute("Articledata")NewArticleCommand command)
 * 	> 생략되면 NewArticleCommand newArticleCommand=new NewArticleCommand()
 * 	> 들어가면(@ModelAttribue("Articledata")) NewArticleCommand Articledata=new NewArticleCommand()
 * 
 * 2.함수를 객체화 시킬 수 있다
 * @컨트롤러
 * 클래스 a {
 * 	@ModelAttribute("obj")
 * 	public ? a(){}
 * }
 * obj객체가 만들어지고 뷰단에서 obj라는 객체이름으로 사용가능
 * bean이 생성될때 호출된다?
 * 공통사용 메뉴구성, ui 미리 구성 할 때
 */

@Controller
public class CodeSearchController {
	
	@ModelAttribute("SearchTypeList")
	public List<SearchType> SearchTypeList(){
		List<SearchType>	options=new ArrayList<SearchType>();
		options.add(new SearchType(1, "전체"));
		options.add(new SearchType(2, "롤"));
		options.add(new SearchType(3, "스타"));
		options.add(new SearchType(4, "와우"));
		options.add(new SearchType(5, "심시티"));
		System.out.println("서치타입리스트 함수 실행");
		return options;
	}
	
	@RequestMapping("/search/main.do")
	public String main(){
		return "search/main";
	}
	
	@ModelAttribute("querylist")
	public String[] getQueryList(){
		System.out.println("영어로 써놔서 못봣네...");
		return new String[]{"game", "star", "city", "wow"};
	}
	
}
