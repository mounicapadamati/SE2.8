package com.app.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.persistence.models.Event;
import com.app.persistence.models.User;


@Repository("userDaoImpl")
public class UserDaoImpl {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void saveUser(User user)
	{
		//entityManager.persist(user);
		UserDao dao = new UserDao();
		dao.addUser(user);
	}


	public List<User> getAllUsers()
	{
		TypedQuery<User> query =
				entityManager.createQuery("SELECT u FROM User u", User.class);
		List<User> results = query.getResultList();
		return results;
	}



}
