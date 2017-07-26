package com.rental_dvd.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String logIn;
	private String email;
	private String password;
	private String createDate;

	@ManyToOne
	private Address address;

	@OneToMany(mappedBy = "customer")
	private List<Payment> payments = new ArrayList<Payment>();

	@OneToMany(mappedBy = "customer")
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, String logIn, String email, String password, String createDate, Address address, List<Payment> payments, List<Rental> rentals) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.logIn = logIn;
		this.email = email;
		this.password = password;
		this.createDate = createDate;
		this.address = address;
		this.payments = payments;
		this.rentals = rentals;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogIn() {
		return logIn;
	}

	public void setLogIn(String logIn) {
		this.logIn = logIn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
}
