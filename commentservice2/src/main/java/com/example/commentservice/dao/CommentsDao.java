package com.example.commentservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.commentservice.model.Comments;

@Repository
public interface CommentsDao  extends JpaRepository<Comments,Integer>{

	public List<Comments> findAllCommentsByPid(Integer pid);
}
