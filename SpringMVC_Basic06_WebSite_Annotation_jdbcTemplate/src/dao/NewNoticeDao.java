package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import vo.Notice;

public class NewNoticeDao implements NoticeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int getCount(String field, String query) {
		String sql = "SELECT COUNT(*) CNT FROM NOTICES WHERE ? LIKE ?";
		String str="%"+query+"%";
		Object[] params={field, str};
		return this.jdbcTemplate.queryForList(sql, params).size();
	}


	@Override
	public List<Notice> getNotices(int page, String field, String query) {
	
		int srow = 1 + (page-1)*5;
		int erow = 5 + (page-1)*5;
		
		String sql = "SELECT * FROM";
		sql += "(SELECT ROWNUM NUM, N.* FROM (SELECT * FROM NOTICES WHERE ? LIKE ? ORDER BY REGDATE DESC) N)";
		sql += "WHERE NUM BETWEEN ? AND ?";
		
		String str="%"+query+"%";
		Object[] params={field, str, srow, erow};
		System.out.println("설마");
		//System.out.println(this.jdbcTemplate.queryForList(sql, params, Notice.class).toString());
		return this.jdbcTemplate.query(sql, new BeanPropertyRowMapper(Notice.class), params);
		//return this.jdbcTemplate.queryForList(sql, params, Notice.class);
	}

	@Override
	public int delete(String seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Notice getNotice(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Notice n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
