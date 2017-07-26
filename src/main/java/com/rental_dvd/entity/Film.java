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
import javax.persistence.OneToMany;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String description;
	private String releaseYear;
	private int rentalDuration;
	private int duration;
	private double rentalRate;
	
	@ManyToOne
	private Language language;
	
	@ManyToMany
	@JoinTable(name = "Category_Film",
	joinColumns=
	@JoinColumn(name = "idFilm"),
	inverseJoinColumns = 
	@JoinColumn(name = "idCategory"))
	private List<Category> categories = new ArrayList<Category>();
	
	
	@ManyToMany
	@JoinTable(name = "Actor_Film",
	joinColumns = 
	@JoinColumn(name = "idFilm"),
	inverseJoinColumns = 
	@JoinColumn(name = "idActor"))
	private List<Actor> actors = new ArrayList<Actor>() ;

	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(String title, String description, String releaseYear, int rentalDuration, int duration, double rentalRate, Language language, List<Category> categories, List<Actor> actors) {
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.rentalDuration = rentalDuration;
		this.duration = duration;
		this.rentalRate = rentalRate;
		this.language = language;
		this.categories = categories;
		this.actors = actors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
