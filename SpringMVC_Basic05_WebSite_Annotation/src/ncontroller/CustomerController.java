package ncontroller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import dao.NoticeDao;
import vo.Notice;

//폴더 경로가 긴 경우
// /customer/notice.htm > notice.htm
// /customer/noticeDetail.htm > noticeDetail.htm

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private NoticeDao noticeDao;
	
	@RequestMapping("notice.htm")
	public String notices(String pg, String f, String q, Model model) throws ClassNotFoundException, SQLException{
		//1단계(전통적인 방법)
		//notices(HttpServletRequest reqeust){request.getParameter("pg")
		
		//2단계(옵션 제약사항)
		//notices(@RequestParam(value="pg", requeired=false, ...))
		
		//3단계(가장 심플)
		//jsp?pg=100&q=1
		//notices(String pg, String f, String q)
		//파라미터 이름과 함수의 파라미터 이름이 동일 > 자동으로 값 매핑
		
		//4단계(객체)
		//Boarddto boardto 일치
		
		//게시판 검색을 위한 기본 설정
		int page=1;
		String field="TITLE";
		String query="%%";
		
		//두 조건 조합
		if(pg!=null && pg.equals("")){
			page=Integer.parseInt(pg);
		} 
		if(f!=null && f.equals("")){
			field=f;
		} 
		if(q!=null && q.equals("")){
			query=q;
		} 
		
		List<Notice> list=noticeDao.getNotices(page, field, query);
		
		//모델객체 사용
		model.addAttribute("list", list);
		
		return "notice";
	}
	/*//게시판 목록보기-내가 한것
	@RequestMapping("notice.htm")
	public ModelAndView handleRequest(NoticeDao noticedao,
			HttpServletRequest request,
			@RequestParam(value="pg", required=false) String _page,
			@RequestParam(value="f", required=false) String _field,
			@RequestParam(value="q", required=false) String _query){
		System.out.println("목록보기 실행");
		
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
		
		List<Notice> list=null;
		try {
			list = noticedao.getNotices(page, field, query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//springmvc
		ModelAndView mv=new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("notice");
		
		return mv;	
	}*/
	
	@RequestMapping("noticeDetail.htm")
	public String notices(String seq, Model model) throws ClassNotFoundException, SQLException{
		Notice notice=noticeDao.getNotice(seq);
		
		//모델객체 사용
		model.addAttribute("notice", notice);
		
		return "noticeDetail";
	}
	/*//게시판 상세보기-내가 한것
	@RequestMapping("noticeDetail.htm")
	public ModelAndView handleRequest2(NoticeDao noticedao,
			HttpServletRequest request,
			@RequestParam(value="seq", required=false) String seq){
		System.out.println("상세보기 실행");
		
		
		Notice notice=null;
		try {
			notice = noticedao.getNotice(seq);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//springmvc
		ModelAndView mv=new ModelAndView();
		mv.addObject("notice", notice);
		mv.setViewName("noticeDetail");
			
		return mv;
	}	*/
	
	//글쓰기(화면)
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.GET)
	public String noticeReg(){
		return "noticeReg";
	}
	
	//글쓰기(처리)
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.POST)
	public String noticeReg(Notice n, HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException{
				
		//전제조건: form에서 전송한 자원이 자동으로.. input태그name=Photo name 		
		CommonsMultipartFile imagefile=n.getFile();
		String filename=imagefile.getOriginalFilename();
		String path=request.getServletContext().getRealPath("/customer/upload");
		String fpath=path+"\\"+filename;
		n.setFileSrc(filename);
		
		FileOutputStream fs=new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
			
		noticeDao.insert(n);

		return "redirect:notice.htm";
	}
	
	//글쓰기(처리)
	@RequestMapping(value="noticeDel.htm")
	public String noticeDel(String seq) throws ClassNotFoundException, SQLException, IOException{	
			
		noticeDao.delete(seq);

		return "redirect:notice.htm";
	}
	
	//글 수정하기(두 가지 처리: 화면(select), 처리(update))
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.GET)
	public String noticeEdit(String seq, Model model) throws ClassNotFoundException, SQLException, IOException{	
		Notice n=noticeDao.getNotice(seq);
		model.addAttribute("notice", n);
		return "noticeEdit";
	}
	
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.POST)
	public String noticeEdit(Notice n, HttpServletRequest request) throws ClassNotFoundException, SQLException, IOException{
		
		//전제조건: form에서 전송한 자원이 자동으로.. input태그name=Photo name 		
		CommonsMultipartFile imagefile=n.getFile();
		String filename=imagefile.getOriginalFilename();
		String path=request.getServletContext().getRealPath("/customer/upload");
		String fpath=path+"\\"+filename;
		n.setFileSrc(filename);
		
		FileOutputStream fs=new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
		
		noticeDao.update(n);
		return "redirect:noticeDetail.htm?seq="+n.getSeq();
	}
}
