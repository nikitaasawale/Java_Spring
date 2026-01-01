package com.Service;

import java.util.List;

import com.Model.User;

public interface Homeservice {
	public List<User> login();
	public void registerDataInService(User user);
	public List<User> getAllUsers();
	public void deleteUserService(int id);
	public User getUserService(int id);
	public void updateUserService(User user);

}
 