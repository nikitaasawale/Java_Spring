package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Model.FileData;
@Repository
public class FileDaoImpl implements FileDao{
	@Autowired
	public SessionFactory sf;

	@Override
	public void uploadfileinDao(FileData filedata) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.save(filedata);
		session.beginTransaction().commit();
		System.out.println("File Uploaded Successfully!!!");
	}

}
