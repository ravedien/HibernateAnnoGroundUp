package com.hibernate.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	@SequenceGenerator(name="poke_id", sequenceName="pokemon_poke_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "poke_id")
	@Column(name = "poke_id", nullable = false)
	private int pokeId;

	@Column(name = "poke_name")
	private String pokeName;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id", referencedColumnName = "type_id")
	private PokeType pokeType;

	@Column(name = "weight")
	private double weight;

	@Column(name = "height")
	private double height;

	@Override
	public String toString() {
		return String.format("Pokemon[pokeId=%d, name='%s', weight='%s', height='%s']", pokeId, pokeName, weight,
				height);
	}

	public Pokemon() {
		super();
	}

	public int getPokeId() {
		return pokeId;
	}

	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}

	public String getPokeName() {
		return pokeName;
	}

	public void setPokeName(String pokeName) {
		this.pokeName = pokeName;
	}

	public PokeType getPokeType() {
		return pokeType;
	}

	public void setPokeType(PokeType pokeType) {
		this.pokeType = pokeType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
