package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.model.Photo;

@Controller
@RequestMapping("/image/upload.do")
public class ImageController {
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		System.out.println("image.jsp 출력");
		return "image/image";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Photo photo, HttpServletRequest request) throws IOException {
		//전제조건: form에서 전송한 자원이 자동으로.. input태그name=Photo name 
		//Photo photo=new Photo();
		//photo.setName=("홍길동")
		System.out.println(photo.getName());
		System.out.println(photo.getAge());
		System.out.println(photo.getFile().getName());
		
		CommonsMultipartFile imagefile=photo.getFile();
		String filename=imagefile.getOriginalFilename();
		String path=request.getServletContext().getRealPath("/upload");
		String fpath=path+"\\"+filename;
		
		FileOutputStream fs=new FileOutputStream(fpath);
		fs.write(imagefile.getBytes());
		fs.close();
		
		return "image/image";
		
	}
}

/*
 * 파일 업로드
 * 1.필요한 라이브러리
 * 	fileupload.jar
 * 	commons.io.jar
 * 
 * 2.ioc컨테이너 안에 bean객체(CommonsMultipartResolver) 생성
 * 
 * 3.dto 사용
 * 	file을 담을 수 있는 멤버필드 생성
 * 	CommonsMultipartFile(+getter, setter) 구현
 * 
 * 4.ui에 input type="file"
 * 
 * 5.Controller객체를 dto파라미터로 
 */