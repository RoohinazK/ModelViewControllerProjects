package com.mindtree.verticalproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Vertical {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int verticalId;

	@Column
	private String verticalName;


	public Vertical(int verticalId, String verticalName) {
		super();
		this.verticalId = verticalId;
		this.verticalName = verticalName;
	}

	public Vertical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVerticalId() {
		return verticalId;
	}

	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}

	public String getVerticalName() {
		return verticalName;
	}

	public void setVerticalName(String verticalName) {
		this.verticalName = verticalName;
	}

}