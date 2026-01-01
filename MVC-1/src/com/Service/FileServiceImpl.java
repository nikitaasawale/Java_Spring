package com.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.DAO.FileDao;
import com.Model.FileData;
@Service
public class FileServiceImpl implements FileService{
	@Autowired
	public FileDao filedao;

	@Override
	public void fileUploadinService(MultipartFile file) {
		// TODO Auto-generated method stub
		FileData filedata=new FileData();
		filedata.setFname(file.getOriginalFilename());
		try {
			filedata.setFdata(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		filedao.uploadfileinDao(filedata);
		System.out.println("File sent to Dao layer from Service");
		
	}

}
