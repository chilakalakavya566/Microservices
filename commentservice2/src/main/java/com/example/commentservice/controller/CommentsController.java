package com.example.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentservice.model.Comments;
import com.example.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/comments")
public class CommentsController {

	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comments> showAll(){
		return service.showAll();
		
	}
	@Value("${server.port}")
	String port;
	
	@GetMapping("/port")
	public String getPort() {
		return port;
	}
	
	@PostMapping("/add")
	public Comments insertComments(Comments comment) {
		return service.insertComment(comment);
		
			
	}
	
	@DeleteMapping("/delete")
	public String deleteComment(Integer cid){
		return service.deleteComment(cid);
		
	}
	
	@GetMapping("/findCommentsByPid/{pid}")
	public List<Comments> getAllCommentsByPid(@PathVariable("pid")Integer pid){
		return service.findAllCommentsByPid(pid);
		
	}
}
