package com.example.commentservice.service;

import java.util.List;

import com.example.commentservice.model.Comments;

public interface CommentService {
	public List<Comments> showAll();
	public Comments insertComment(Comments comment);
	public String deleteComment( Integer cid);
	public List<Comments> findAllCommentsByPid(Integer pid);
	

}
