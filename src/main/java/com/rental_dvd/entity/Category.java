package com.rental_dvd.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany
	@JoinTable(name = "Category_Film",
	joinColumns = 
	@JoinColumn(name = "idCategory"),
	inverseJoinColumns=
	@JoinColumn(name = "idFilm"))
	private List<Film> films = new ArrayList<Film>();

	public Category() {
		// TODO Auto-generated constructor stub
	}


	public Category(String name, List<Film> films) {
		this.name = name;
		this.films = films;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
}
