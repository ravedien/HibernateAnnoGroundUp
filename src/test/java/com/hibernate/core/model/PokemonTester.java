package com.hibernate.core.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.core.util.HibernateUtil;

public class PokemonTester {
	public static void main(String[] args) {
		PokemonTester pokemonTester = new PokemonTester();
	}
	
	public Integer insertPokemon(){
		Integer generatedId = null;
		try{
			HibernateUtil.beginTransaction();
//			generatedId =  HibernateUtil.getSession().save(pokemon);
			
		}
		catch(Exception e){
			e.printStackTrace();
			HibernateUtil.rollbackTransaction();
		}finally {
			HibernateUtil.closeSession();
		}
		return 1;
	}
}
