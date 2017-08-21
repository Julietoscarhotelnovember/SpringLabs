package DI_06_Spring;

public class WriteArticleService {
	//요청판단
	private ArticleDAO articledao;
	public WriteArticleService(ArticleDAO articledao){
		this.articledao=articledao;
		System.out.println("WriteArticleService 생성자 호출");
	}
	
	//사용자 요청 글쓰기 서비스
	public void Write(Article article){
		articledao.insert(article);
	}
}
