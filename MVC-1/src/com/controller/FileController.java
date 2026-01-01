package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Service.FileService;

@Controller
public class FileController {
	@Autowired
	public FileService fileservice;
	
	@RequestMapping("/uploadFile")
	public String uploadFileinController(@RequestParam("file")MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		fileservice.fileUploadinService(file);
		System.out.println("File sent to Service");
		return "success";
		
		
	}

}
