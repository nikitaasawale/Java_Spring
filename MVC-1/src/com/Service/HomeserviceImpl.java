package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.DAO.HomeDao;
import com.Model.User;



@Service
public class HomeserviceImpl implements Homeservice{
	@Autowired
	private HomeDao homedao;

	@Override
	public List<User> login() {
		
		List<User> listofuser=homedao.loginInDao();
		return listofuser;
	}

	@Override
	public void registerDataInService(User user) {
		
		System.out.println("This is Service layer:"+user);
		homedao.registerDatainDao(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		List<User> listofuser=homedao.getAllUsers();
		System.out.println("All users in service:"+listofuser);
		return listofuser;
	}

	@Override
	public void deleteUserService(int id) {
		
		homedao.deleteUserDao(id);
		
	}

	@Override
	public User getUserService(int id) {
		
		User user=homedao.getUserDao(id);
		return user;
		
	}

	@Override
	public void updateUserService(User user) {
		// TODO Auto-generated method stub
		homedao.updateUserDao(user);
		
	}

	
}
