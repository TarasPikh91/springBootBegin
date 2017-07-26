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
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rentalDate;
	private String returnDate;

	@ManyToOne
	private Staff staff;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "rental")
	private List<Payment> payments = new ArrayList<Payment>();

	public Rental() {
		// TODO Auto-generated constructor stub
	}

	public Rental(String rentalDate, String returnDate, Staff staff, Customer customer, List<Payment> payments) {
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.staff = staff;
		this.customer = customer;
		this.payments = payments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
}
