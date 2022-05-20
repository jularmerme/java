package com.revature.model;

import javax.persistence.*;

@Entity
@Table(name="heroes")
public class Hero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="h_id")
	private int id;
	
	@Column(name="h_name", unique=true, nullable=false)
	private String name;
	
	@Column(name="h_superpower")
	private String superPower;
	
	@Column(name="h_hascape", nullable=false)
	private boolean hasCape;
	
	public Hero() {
		super();
	}

	public Hero(String name, String superPower, boolean hasCape) {
		super();
		this.name = name;
		this.superPower = superPower;
		this.hasCape = hasCape;
	}

	public Hero(int id, String name, String superPower, boolean hasCape) {
		super();
		this.id = id;
		this.name = name;
		this.superPower = superPower;
		this.hasCape = hasCape;
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

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public boolean isHasCape() {
		return hasCape;
	}

	public void setHasCape(boolean hasCape) {
		this.hasCape = hasCape;
	}
	
	
	
}
