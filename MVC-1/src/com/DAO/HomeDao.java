package com.DAO;

import java.util.List;

import com.Model.User;

public interface HomeDao {
	public void registerDatainDao(User user);
	public List<User> loginInDao();
	public List<User> getAllUsers();
	public void deleteUserDao(int id);
	public User getUserDao(int id);
	public void updateUserDao(User user);

}
