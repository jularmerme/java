package net.restapi.dycontent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Videos {
	
	@Id
	@GeneratedValue
	private int vid;
	
	private String title;
	
	private String description;
	
	private String link;

	public Videos() {
		super();
	}

	public Videos(String title, String description, String link) {
		super();
		this.title = title;
		this.description = description;
		this.link = link;
	}

	public Videos(int vid, String title, String description, String link) {
		super();
		this.vid = vid;
		this.title = title;
		this.description = description;
		this.link = link;
	}

}
