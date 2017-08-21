package com.model;

import java.sql.SQLException;

public interface MemberDAO {

	//회원 상세 조회(데이터 한건)
	MemberVO selectMemberById(String id) throws SQLException;
	
	//회원 유무를 판단하는 조회 메서드
	boolean memeberCheck(String id, String pwd) throws SQLException;
	
	//회원 가입 메서드
	boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException;
}
