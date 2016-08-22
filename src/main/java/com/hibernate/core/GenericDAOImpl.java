package com.hibernate.core;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class GenericDAOImpl<T> implements GenericDAO<T> {

	public Integer save(T entity, Session session) {
		return (Integer) session.save(entity);
	}

	public void update(T entity, Session session) {
		// TODO Auto-generated method stub
		
	}

	public void delete(T entity, Session session) {
		// TODO Auto-generated method stub
		
	}

	public List<T> findManyByCriteria(Criteria criteria, Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findOneByCriteria(Criteria criteria, Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findAll(Class clazz, Session session) {
		// TODO Auto-generated method stub
		return null;
	}
}
