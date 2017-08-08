package com.app.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.persistence.models.Event;

@Repository
public class EventsDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	
	@Transactional
	public void saveEvent(Event event)
	{
		//entityManager.persist(event);
		UserDao dao = new UserDao();
		dao.addEvent(event);
	}
	
	
	public List<Event> getAllEvents()
	{
		TypedQuery<Event> query =
				entityManager.createQuery("SELECT e FROM Event e", Event.class);
		List<Event> results = query.getResultList();
			  
			  return results;
	}
	

	
}