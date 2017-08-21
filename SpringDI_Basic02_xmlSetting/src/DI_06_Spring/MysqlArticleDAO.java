package DI_06_Spring;

public class MysqlArticleDAO implements ArticleDAO {

	@Override
	public void insert(Article arcicle) {
		System.out.println("mysql insert");
		
	}
	
}
