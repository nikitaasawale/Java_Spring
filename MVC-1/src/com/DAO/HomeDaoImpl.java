package com.DAO;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Model.User;
@Repository
public class HomeDaoImpl implements HomeDao{
	@Autowired
	private SessionFactory sf;

	@Override
	public void registerDatainDao(User user) {
		// TODO Auto-generated method stub
		System.out.println("I am in DAO layer"+user);
		Session s=sf.openSession();
		s.save(user);
		s.beginTransaction().commit();
		System.out.println("User Saved");
	}

	@Override
	public List<User> loginInDao() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query query=s.createQuery("from User");
		List<User> listofuser=query.getResultList();
		s.beginTransaction().commit();
		return listofuser;
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Session s=sf.openSession();
		Query query=s.createQuery("from User");
		List<User> listofuser=query.getResultList();
		s.beginTransaction().commit();
		return listofuser;
	}

	@Override
	public void deleteUserDao(int id) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		User user=session.get(User.class, id);
		session.delete(user);
		session.beginTransaction().commit();
		System.out.println("User deleted");
	}

	@Override
	public User getUserDao(int id) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		User user=session.get(User.class, id);
		session.beginTransaction().commit();
		return user;
	}

	@Override
	public void updateUserDao(User user) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		session.saveOrUpdate(user);
		session.beginTransaction().commit();
		System.out.println("User Updated!!!");
		
	}

}
