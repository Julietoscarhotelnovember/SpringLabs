package com.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/*
 * create table myphoto(
 * 	name varchar2(20),
 * 	age number,
 * 	image varchar2(50)
 * )
 */

public class Photo {
	private String name;
	private int age;
	private String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	//파일전송 멤버필드
	private CommonsMultipartFile file; //form태그의 name과 같이야 자동매핑 된다
	public CommonsMultipartFile getFile() {
		return file;
	}
	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}
	
}
