package com.hibernate.core.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.core.util.HibernateUtil;

public class PokemonService {
	
	
	public Integer savePokemon(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Integer generatedId = null;
		try{
			tx = session.beginTransaction();
			
		}catch(Exception e){
			System.err.println("savePokemon service error:"+e.getStackTrace());
			if(tx != null){
				tx.rollback();
			}
		}finally {
			session.close();
		}
		return generatedId;
	}
	
}
