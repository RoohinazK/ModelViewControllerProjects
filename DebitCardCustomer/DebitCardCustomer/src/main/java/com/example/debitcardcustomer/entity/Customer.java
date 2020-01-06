package com.example.debitcardcustomer.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Customer implements Comparable<Customer> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	@Column
	private String customerName;

	@Column
	private int age;

//	@JsonBackReference("customer")
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<DebitCard> debitcard;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, int age, List<DebitCard> debitcard) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.debitcard = debitcard;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<DebitCard> getDebitcard() {
		return debitcard;
	}

	public void setDebitcard(List<DebitCard> debitcard) {
		this.debitcard = debitcard;
	}

	@Override
	public int compareTo(Customer c1) {
		// TODO Auto-generated method stub

		return c1.getDebitcard().size() - this.getDebitcard().size();
	}
}
