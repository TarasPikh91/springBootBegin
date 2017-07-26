package com.rental_dvd.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int amount;
	private String paymentDate;

	@ManyToOne
	private Customer customer;

	@ManyToOne
	private Staff staff;

	@ManyToOne
	private Rental rental;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int amount, String paymentDate, Customer customer, Staff staff, Rental rental) {
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.customer = customer;
		this.staff = staff;
		this.rental = rental;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}
}
