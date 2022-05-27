package com.blog.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.system.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
