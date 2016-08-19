package com.hibernate.core.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PokeType {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poke_type_type_id_seq")
	private int typeId;
	private String typeName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pokeType", targetEntity = Pokemon.class, fetch = FetchType.LAZY)
	private List<Pokemon> pokemonList;

	@Override
	public String toString() {
		return String.format("PokeType[typeId=%d, typeName='%s']", typeId, typeName);
	}

	public PokeType() {
		super();
	}

	public PokeType(int typeId, String typeName, List<Pokemon> pokemonList) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.pokemonList = pokemonList;
	}

}
