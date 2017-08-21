package board_Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.Action;
import Action.ActionForward;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Controller() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//url 잡기
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        String cmdURI = requestURI.substring(contextPath.length());
        System.out.println("요청 들어온 uri: "+cmdURI);
        
        ActionForward forward = new ActionForward();
        Action action = null;

        //판단
        if (cmdURI.equals("/list.do")){
        	System.out.println("리스트 보여주기");
        	forward.setRedirect(false);
        	forward.setPath("WEB-INF/board/list.jsp");
        } else if (cmdURI.equals("/write.do")){
        	System.out.println("글쓰기");
        	forward.setRedirect(false);
        	forward.setPath("WEB-INF/board/insert.jsp"); 	
        } else if (cmdURI.equals("/writeOk.do")){
        	System.out.println("글작성 완료");
        	
        }
        
		//내보내기
        if(forward != null){
        	if(forward.isRedirect()) {
        		try {
					response.sendRedirect(forward.getPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	else {
        		RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
        		try {
					dis.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
	}

}
