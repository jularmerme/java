package com.blog.system.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.system.entities.Comment;
import com.blog.system.entities.CommentDTO;
import com.blog.system.exceptions.ResourceNotFoundException;
import com.blog.system.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public CommentDTO createComment(CommentDTO commentDTO) {
		Comment comment = mapEntity(commentDTO);
		Comment newComment = commentRepository.save(comment);
		CommentDTO commentResponse = mapDTO(newComment);
		return commentResponse;
	}

	@Override
	public List<CommentDTO> getAllComments() {
		List<Comment> comments = commentRepository.findAll();
		return comments.stream().map(comment -> mapDTO(comment)).collect(Collectors.toList());
	}
	
	// Convert from Entity to DTO
	private CommentDTO mapDTO(Comment comment) {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setId(comment.getId());
		commentDTO.setTitle(comment.getTitle());
		commentDTO.setDescription(comment.getDescription());
		commentDTO.setContent(comment.getContent());
		return commentDTO;
	}
	
	// Convert from DTO to Entity
	private Comment mapEntity(CommentDTO commentDTO) {
		Comment comment = new Comment();
		comment.setId(commentDTO.getId());
		comment.setTitle(commentDTO.getTitle());
		comment.setDescription(commentDTO.getDescription());
		comment.setContent(commentDTO.getContent());
		return comment;
	}

	@Override
	public CommentDTO getCommentById(long id) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", id));
		return mapDTO(comment);
	}

	@Override
	public CommentDTO updateComment(CommentDTO commentDTO, long id) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", id));
		
		comment.setTitle(commentDTO.getTitle());
		comment.setDescription(commentDTO.getDescription());
		comment.setContent(commentDTO.getContent());
		
		Comment commentUpdated = commentRepository.save(comment);
		
		return mapDTO(commentUpdated);
	}

	@Override
	public void deleteComment(long id) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Comment", "id", id));
		commentRepository.delete(comment);
	}

}
