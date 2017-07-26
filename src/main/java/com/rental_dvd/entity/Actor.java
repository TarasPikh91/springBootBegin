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
import javax.persistence.ManyToOne;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	
//	@ManyToOne 
//	private Film film;
	
	
	@ManyToMany
	@JoinTable(name = "Actor_Film",
	joinColumns = 
	@JoinColumn(name = "idActor"),
	inverseJoinColumns = 
	@JoinColumn(name = "idFilm"))
	private List<Film> films = new ArrayList<Film>();
	
	
	public Actor() {
		// TODO Auto-generated constructor stub
	}

	public Actor(String firstName, String lastName, List<Film> films) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.films = films;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
}
