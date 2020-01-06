package com.example.debitcardcustomer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class DebitCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int debitCardId;

	@Column
	private String cardNumber;

	@Column
	private String date;

	@Column
	private int amount;

	@Column
	private String debitCardType;

	@ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;

	public DebitCard(int debitCardId, String cardNumber, String date, int amount, String debitCardType,
			Customer customer) {
		super();
		this.debitCardId = debitCardId;
		this.cardNumber = cardNumber;
		this.date = date;
		this.amount = amount;
		this.debitCardType = debitCardType;
		this.customer = customer;
	}

	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDebitCardId() {
		return debitCardId;
	}

	public void setDebitCardId(int debitCardId) {
		this.debitCardId = debitCardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDebitCardType() {
		return debitCardType;
	}

	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
