package com.service;

import org.springframework.stereotype.Service;

import com.model.NewArticleCommand;

/*
 * @Service
 * 이렇게 하면 servlet.xml에서 별도의 bean을 만들지 않아도 됨
 * component-scan으로 한번에
 */
public class ArticleService {
	//요청판단 서비스
	//controller > service > dao(dto)
	public void writeArticle(NewArticleCommand command){
		//dao객체 생성
		//dao 객체 함수 호출(db insert) 완료
		System.out.println("신규 글쓰기 작업 완료 "+command.toString());
		
	}
}
