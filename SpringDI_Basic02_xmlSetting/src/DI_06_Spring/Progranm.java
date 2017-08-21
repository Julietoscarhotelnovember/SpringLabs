package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Progranm {

	public static void main(String[] args) {
		// mysql연동, insert 작업
		/*ArticleDAO dao=new MysqlArticleDAO();
		WriteArticleService service=new WriteArticleService(dao);
		Article article=new Article();*/
		
		ApplicationContext context=new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
		
		WriteArticleService service=context.getBean("service", WriteArticleService.class);
		Article article=context.getBean("article", Article.class);
		service.Write(article);
	}

}
