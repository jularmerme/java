package com.blog.system.services;

import java.util.List;

import com.blog.system.entities.CommentDTO;

public interface CommentService {

		public CommentDTO createComment(CommentDTO commentDTO);
		
		public List<CommentDTO> getAllComments();
		
		public CommentDTO getCommentById(long id);

		public CommentDTO updateComment(CommentDTO commentDTO, long id);
		
		public void deleteComment(long id);
	
}
