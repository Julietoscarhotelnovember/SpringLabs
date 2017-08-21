package com.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.MemberDAO;

//문제
//로그인 화면 : GET 요청 > loginForm.jsp > 
//로그인 처리 : POST 요청 > id ,pwd > membercheck 검증 > loginSuccess.jsp
//성공하면 : Session 담기 > 기존과 동일  
//ex) public void test(HttpSession session) { session.setAttribute(,)}
//USERID session 생성해서 id값 담으세요

//@Controller
//@RequestMapping("/loing.do")
//두개의 함수 : GET , POST 매핑

@Controller
@RequestMapping("/login.do")
public class LoginController {

	@Autowired
	MemberDAO memberdao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(
			@RequestParam(value="id") String id,
			@RequestParam(value="pwd") String pwd,
			HttpSession session
		) throws SQLException{
		
		String view=null;
		boolean checkresult=memberdao.memeberCheck(id, pwd);
		System.out.println("membercheck: "+checkresult);
		
		if(checkresult){
			view="loginSuccess";
			session.setAttribute("USERID", id);
		}else{
			view="loginForm";
		}
		return view;
	}
}



