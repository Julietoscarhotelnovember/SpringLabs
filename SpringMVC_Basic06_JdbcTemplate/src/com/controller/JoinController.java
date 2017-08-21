package com.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.MemberDAO;

@Controller
public class JoinController {
	
	private MemberDAO memberdao;
	
	@Autowired
	public void setMemberdao(MemberDAO memberdao) {
		this.memberdao = memberdao;
	}

	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String form(){
		return "joinForm";
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
	public String submit(
			@RequestParam(value="id") String id,
			@RequestParam(value="name") String name,
			@RequestParam(value="pwd") String pwd,
			@RequestParam(value="email") String email,
			@RequestParam(value="age") int age
		) throws SQLException{
		System.out.println("id: "+id);
		String view=null;
		boolean joinresult=memberdao.memberInsert(id, name, pwd, email, age);
		System.out.println("joinresult: "+joinresult);
		
		if(joinresult){
			view="joinSuccess";
		}else{
			view="joinForm";
		}
		return view;
	}
}
