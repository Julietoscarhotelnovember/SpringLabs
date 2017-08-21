package DI_06_Spring;

public class OracleArticleDAO implements ArticleDAO{

	@Override
	public void insert(Article arcicle) {
		System.out.println("oracle insert");
		
	}

}
