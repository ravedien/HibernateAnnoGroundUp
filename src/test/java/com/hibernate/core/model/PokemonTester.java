package com.hibernate.core.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.core.GenericDAOImpl;
import com.hibernate.core.util.HibernateUtil;

public class PokemonTester {
	
	GenericDAOImpl<Pokemon> pokemonDAO = new GenericDAOImpl<Pokemon>();

	public static void main(String[] args) {
		
		PokemonTester implTester = new PokemonTester();
		
		Pokemon haunter = implTester.createPokemonDependency();
		haunter.setPokeType(implTester.createPokemonTypeDependency());
		
		implTester.insertPokemon(haunter);
	}
	
	public Integer insertPokemon(Pokemon pokemon){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Integer generatedId = null;
		try{
			tx = session.beginTransaction();
			generatedId = pokemonDAO.save(pokemon, session);
			tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			if(tx != null){
				tx.rollback();
			}
			
		}finally {
			session.close();
		}
		return generatedId;
	}

	private Pokemon createPokemonDependency() {
		Pokemon pokemon = new Pokemon();
		pokemon.setHeight(1.6);
		pokemon.setPokeName("Haunter");
		pokemon.setWeight(0.1);
		return pokemon;
	}
	private PokeType createPokemonTypeDependency() {
		PokeType pokemonType = new PokeType();
		pokemonType.setTypeName("Ghost");
		return pokemonType;
	}
}
