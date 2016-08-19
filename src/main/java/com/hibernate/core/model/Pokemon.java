package com.hibernate.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_poke_id_seq")
	private int pokeId;

	private String pokeName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "typeId", referencedColumnName = "typeId")
	private PokeType pokeType;

	private double weight;
	private double height;

	@Override
	public String toString() {
		return String.format("Pokemon[pokeId=%d, name='%s', weight='%s', height='%s']", pokeId, pokeName, weight, height);
	}

	public Pokemon() {
		super();
	}

	public Pokemon(int pokeId, String pokeName, PokeType pokeType, double weight, double height) {
		super();
		this.pokeId = pokeId;
		this.pokeName = pokeName;
		this.pokeType = pokeType;
		this.weight = weight;
		this.height = height;
	}

}
