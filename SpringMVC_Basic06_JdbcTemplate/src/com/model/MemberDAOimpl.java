package com.model;

import java.sql.SQLException;

import org.apache.catalina.tribes.membership.McastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

//기존: 모델2기반 mvc에서는 jdbc api 사용
//Spring 제공 template: jdbctemplate > 코드량 감소, 일원화된 코드(유지보수)
//문제 > 인터페이스, 익명클래스 > 생략된 코드, 추상화(가독성 감소)
public class MemberDAOimpl implements MemberDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public MemberVO selectMemberById(String id) throws SQLException {
		String sql="select * from usermember where id=?";
		//jdbctemplate
		try{
			return this.jdbcTemplate.queryForObject(
					sql,
					new BeanPropertyRowMapper<MemberVO>(MemberVO.class),
					id
			);
		} catch(EmptyResultDataAccessException e){
			return null;			
		}
		
		/*
		 * BeanPropertyRowMapper<MemberVO>(MemberVO.class)
		 * 전제조건: vo객체가 가지는 멤버필드명=db에서 셀릭트 되는 컬럼명
		 * 꼼수
		 * db:userid
		 * vo:id
		 * query: select userid as "id"
		 * 
		 * 
		 * 아래 코드 생략
		 * MemberVO member=new MemberVO();
		 * rs.next();
		 * member.setId(rs.getInt("id"));
		 * return member
		 */
	}

	@Override
	public boolean memeberCheck(String id, String pwd) throws SQLException {
		String sql="select * from usermember where id=? and pwd=?";
		boolean result=false;
		Object[] params={id, pwd};
		//return List<member>
		if(this.jdbcTemplate.queryForList(sql, params).size()>0){
			result=true;
		}
		return result;
	}

	@Override
	public boolean memberInsert(
			String id,
			String name,
			String pwd,
			String email,
			int age
		) throws SQLException {
			String sql="insert into usermember values(?, ?, ?, ?, ?)";
			boolean result=false;
			Object[] params={id, name, pwd, email, age};
	
			//update 하나로 다 된다
			if(this.jdbcTemplate.update(sql, params)>0){
				result=true;
			}
			return result;
	}

}
