package com.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.MemberDAO;
import com.model.MemberVO;

//화면: memeberSearch.jsp
//처리: memeberResult.jsp(결과객체출력)

@Controller
public class MemberSearchController {
	
	@Autowired
	private MemberDAO memberdao;
	
	@RequestMapping(value="/check.do", method=RequestMethod.GET)
	public String form(){
		return "memberSearch";
	}
	
	@RequestMapping(value="/check.do", method=RequestMethod.POST)
	public ModelAndView submit(String id) throws SQLException{
		MemberVO membervo=memberdao.selectMemberById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("memberok", membervo);
		if(membervo!=null){
			mv.setViewName("memberResult");
		}else{
			mv.setViewName("memberSearch");
		}
		return mv;
	}
	
}
