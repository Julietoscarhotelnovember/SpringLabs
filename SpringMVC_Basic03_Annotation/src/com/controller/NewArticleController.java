package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.NewArticleCommand;
import com.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle.do") //이렇게 걸면 클래스 전체에서 get, post를 구분할 수 있다
public class NewArticleController {
	//글쓰기는 폼만 보여주는것과 글쓰기 완료(서버전송)으로 나누어지는데,
	//화면만 처리하면 get으로, 내용전송은 post로 처리 하겠다
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		System.out.println("get 방식에 대한 요청 처리 함수");
		return "article/newArticleForm";
		//이렇게 requestmapping+스트링 리턴하면 하면 이게 뷰의 주소가 된대...
	}
	
	private ArticleService articleService;
	
	@Autowired
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}


	//1.form태그의 title, content > request.get~
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("Articledata")NewArticleCommand command){
		/*
		 * 기존방식
		 * NewArticleCommand command=new NewArticleCommand();
		 * command.setTitle(Request.getpr("title");
		 * request.setAtrrbue까지 다 해준다
		 */
		
		System.out.println("submit");
		System.out.println("전송방식: post");
		System.out.println("command: "+command.toString());
		
		//servie객체를 통해서 db insert작업
		System.out.println("service: "+articleService.toString());
		articleService.writeArticle(command);
		return "article/newArticleSubmitted"; //view이름 리턴
		
	}
}


/*
 * 문제점1
 * 요청이 post방식일 경우
 * <form method="post">
 * submit 전송시
 * action은 어떻게 되나??
 * 현재 url이 가진 주소값을 그대로 action으로 사용한다.
 * 
 * 문제점2
 * public string submit(NewArticleCommand command){}에는 뭐가 숨어있나?
 * 기존에는 request.get~으로 했는데...
 * 내부적으로 어떤 코드가 실행됐을까?
 * NewArticleCommand 자동 new로 생성
 * setter를 통해 사용자의 입력값 자동 주입
 * 성립조건: <input name="값" 이 dto클래스의 멤버필드와 동일해야 함
 * springmvc에서는 일반적으로 dto객체를 파라미터로 사용
 * 
 * 문제점3
 * return "article/newArticleSubmitted"
 * newaritleSubmitted.jsp 화면 출력
 * 모델엔뷰 객체를 사용한다면
 * mv.add
 * mv.setviewname
 * return mv
 * 
 * 왜 public String submit(NewArticleCommand command)
 * 자동 빈 드록
 * 내부적으로 자동화
 * <bean id="newArticleCommand class=~></bean>
 * id가 자동으로 newArticelCommand로 잡힌다
 * 
 * method 파라미터에 사용되는 객체는 자동으로 bean 등록, id값도 자동 설정 됨
 * 
 * 나는 자동으로 만들어지는 객체 빈이름id를 사룡하지 않을 것이다
 * @ModelAttribute("Articledata")NewArticleCommand command 할수 있음
 * 그럼 내부적으로
 * NewArticleCommand Articledata=new NewArticleCommand() 생성 효과
 */