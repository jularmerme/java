package com.blog.system.entities;

import lombok.Data;

public @Data class CommentDTO {

	private Long id;
	private String title;
	private String description;
	private String content;
	
	public CommentDTO() {
		super();
	}

	public CommentDTO(String title, String description, String content) {
		super();
		this.title = title;
		this.description = description;
		this.content = content;
	}

	public CommentDTO(Long id, String title, String description, String content) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.content = content;
	}
	
}
