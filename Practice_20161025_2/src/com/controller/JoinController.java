package com.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.MemberDAO;
import com.dto.Member;

@Controller
public class JoinController {
	
	@Autowired
	private MemberDAO memberDAO;

	//join.htm request mapping...단, get 타입
	@RequestMapping(value="/join.htm", method=RequestMethod.GET)
	public String join(){
		
		//여기서 joinForm.jsp 를 부른다.
		
		return "join/joinForm.jsp";
	}
	
	//join.htm request mapping...단, post 타입
	@RequestMapping(value="join.htm", method=RequestMethod.POST)
	public String join(Member member) throws ClassNotFoundException, SQLException{

		int num=memberDAO.insert(member);
		//여기서 매개변수로 넘겨받은 member를 DB에 삽입한다.
		//삽입 성공한 후에는 joinOk.htm 을 호출한다.
		//단, joinOk.htm 을 호출할 때 userid 를 파라미터로 넘긴다.
		if (num==1){
			return "redirect:joinOk.htm?userid="+member.getUserid();
		} else {
			return null;
		}
	}
	
	//joinOk.htm request mapping
	@RequestMapping("/joinOk.htm")
	public String joinOk(String userid, Model model) throws ClassNotFoundException, SQLException{
		Member member=memberDAO.getMember(userid);
		model.addAttribute("member", member);
		//DB에서 userid 를 기준으로 검색하여 검색 결과를 리턴 받는다.
		//결과는 joinOk.jsp 로 보낸다.
		
		return "join/joinOk.jsp";
	}
	
}
