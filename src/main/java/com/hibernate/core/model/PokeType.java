package com.hibernate.core.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="poke_type")
public class PokeType {
	
	@Id
	@SequenceGenerator(name="type_id", sequenceName="poke_type_type_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_id")
	@Column(name="type_id")
	private int typeId;
	
	@Column(name="type_name")
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

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(List<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}

}
