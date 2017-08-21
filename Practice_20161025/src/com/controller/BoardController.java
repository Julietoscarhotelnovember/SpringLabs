package com.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.BoardDTO;
import com.service.BoardListService;
import com.service.BoardWriteService;

@Controller
public class BoardController {

	private BoardWriteService boardWriteService;
	private BoardListService boardListService;
	
	@Autowired
	public void setBoardListService(BoardListService boardListService) {
		this.boardListService = boardListService;
	}
	
	@Autowired
	public void setBoardWriteService(BoardWriteService boardWriteService) {
		this.boardWriteService = boardWriteService;
	}
	
	// RequestMapping 주소 => "/board/boardWrite.do"
	@RequestMapping("/board/boardWrite.do")
	public String goBoardWrite(){
		
		return "board/BoardWrite";
	}

	// RequestMapping 주소 => "/board/boardWriteOk.do"
	@RequestMapping("/board/boardWriteOk.do")
	public String writeBoard(BoardDTO dto, HttpServletResponse response){
		int result = boardWriteService.boardWrite(dto);
		
		if(result == 1){
			//여기에서 title, content, index 쿠키를 생성하여, 저장한다.
			response.addCookie(new Cookie("title", dto.getTitle()));
			response.addCookie(new Cookie("content", dto.getContent()));
			response.addCookie(new Cookie("index", String.valueOf(dto.getIndex())));
			
		}
			
		return "board/WriteOk";
	}
	
	// RequestMapping 주소 => "/board/boardList.do"
	@RequestMapping("/board/boardList.do")
	public ModelAndView listBoard(@CookieValue("title") String title,
			@CookieValue("content") String content,
			@CookieValue("index") int index
				//@CookieValue Annotation을 사용하여, title / content / index 로 저장된 쿠키의 값을 여기서 받는다.
				//각 쿠키의 값은 String title, String content, int index 로 받는다.
				
			)
	{
		ModelAndView mv = new ModelAndView();
		
		int result = boardListService.viewBoard();
		
		if(result == 1){
			BoardDTO dto = new BoardDTO();
			dto.setTitle(title);
			dto.setContent(content);
			dto.setIndex(index);
			mv.addObject("board", dto);
		}
		
		mv.setViewName("board/BoardList");
		
		return mv;
	}
	
	
}
