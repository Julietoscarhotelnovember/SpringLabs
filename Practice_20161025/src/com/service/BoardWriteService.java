package com.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CookieValue;

import com.dto.BoardDTO;

public class BoardWriteService {
	
	public int boardWrite(BoardDTO dto){
		System.out.println("DB에 작성한 글 삽입 중...");
		
		if(dto != null){
			return 1;
		}else{
			return 0;
		}
	}
	
}
