package controllers.customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.NoticeDao;
import vo.Notice;

@Controller
public class NoticeController{
	
	@Autowired
	private NoticeDao noticedao;
	
	@RequestMapping("/notice.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("목록보기 실행");
		
		String _page=request.getParameter("pg");
		String _field=request.getParameter("f");
		String _query=request.getParameter("q");
		System.out.println(_page+" / "+_field+" / "+_query);
		
		//게시판 검색을 위한 기본 설정
		int page=1;
		String field="TITLE";
		String query="%%";
		
		//두 조건 조합
		if(_page!=null && _page.equals("")){
			page=Integer.parseInt(_page);
		} 
		if(_field!=null && _field.equals("")){
			field=_field;
		} 
		if(_query!=null && _query.equals("")){
			query=_query;
		} 
		
		List<Notice> list=noticedao.getNotices(page, field, query);
		
		//springmvc
		ModelAndView mv=new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("customer/notice.jsp");
		
		//내부적으로 forward
		//요청주소 customer/notice.htm > 주소변경 안됨, 내용은 notice.jsp
		
		return mv;
	}

}
