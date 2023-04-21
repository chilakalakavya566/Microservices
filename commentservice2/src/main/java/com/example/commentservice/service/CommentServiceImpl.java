package com.example.commentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentservice.dao.CommentsDao;
import com.example.commentservice.model.Comments;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentsDao dao;
	
	
	@Override
	public List<Comments> showAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Comments insertComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public String deleteComment(Integer cid) {
		// TODO Auto-generated method stub
		dao.deleteById(cid);
		return "comment deleted";
	}

	@Override
	public List<Comments> findAllCommentsByPid(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findAllCommentsByPid(pid);
	}
	
	

}
