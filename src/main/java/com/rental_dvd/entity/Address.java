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
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String district;
	
	@OneToMany(mappedBy = "address")
	private List<Customer> customers = new ArrayList<Customer>();
	
	@OneToMany(mappedBy = "address")
	private List<Store> stores = new ArrayList<Store>();
	
	@ManyToOne
	private City city;
	
	@OneToMany(mappedBy = "address")
	private List<Staff> staffs = new ArrayList<Staff>();

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String address, String district, List<Customer> customers, List<Store> stores, City city, List<Staff> staffs) {
		this.address = address;
		this.district = district;
		this.customers = customers;
		this.stores = stores;
		this.city = city;
		this.staffs = staffs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
}
