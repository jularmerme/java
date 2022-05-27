package com.blog.system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.system.entities.CommentDTO;
import com.blog.system.services.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public ResponseEntity<CommentDTO> saveComment(@RequestBody CommentDTO commentDTO) {
		return new ResponseEntity<>(commentService.createComment(commentDTO), HttpStatus.CREATED);
	}

	@GetMapping
	public List<CommentDTO> listComments() {
		return commentService.getAllComments();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CommentDTO> getCommentById(@PathVariable(name = "id") long id) {
		return ResponseEntity.ok(commentService.getCommentById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CommentDTO> updateComment(@RequestBody CommentDTO commentDTO, @PathVariable(name = "id") long id) {
		CommentDTO commentResponse = commentService.updateComment(commentDTO, id);
		return new ResponseEntity<>(commentResponse, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteComment(@PathVariable(name = "id") long id) {
		commentService.deleteComment(id);
		return new ResponseEntity<>("Comment was deleted successfully!!!", HttpStatus.OK);
	}
	
}
