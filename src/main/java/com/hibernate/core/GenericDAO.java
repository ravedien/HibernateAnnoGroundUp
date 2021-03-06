package com.hibernate.core;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public interface GenericDAO<T> {
	public Integer save(T entity, Session session);

	public void update(T entity, Session session);

	public void delete(T entity, Session session);

	public List<T> findManyByCriteria(Criteria criteria, Session session);

	public T findOneByCriteria(Criteria criteria, Session session);

	public List<T> findAll(Class clazz, Session session);
}
