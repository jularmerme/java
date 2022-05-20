package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="shops")
@Data
public class Candy {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name", unique=true, nullable=false)
	private String name;
	
	@Column(name="c_price", nullable=false)
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="c_shop", referencedColumnName= "s_id")
	private Shop shop;
	
	public Candy() {}

	public Candy(String name, double price, Shop shop) {
		super();
		this.name = name;
		this.price = price;
		this.shop = shop;
	}

	public Candy(int id, String name, double price, Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.shop = shop;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}
