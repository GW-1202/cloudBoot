package com.smhrd.board.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FileUploadConfig { //환경설정 
	
	//upload 될 경로 설정
	@Value("${file.upload-dir}")
	private String uploadDir;
	
	public String getUploadDir() {
		return uploadDir;
	}
	

	
	
	
}
