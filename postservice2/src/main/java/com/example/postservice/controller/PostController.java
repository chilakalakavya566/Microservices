package com.example.postservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Post;
import com.example.postservice.service.PostService;

import io.github.resilience4j.retry.annotation.Retry;
@RestController
@RequestMapping("/posts")
public class PostController {
	
	Logger logger= LoggerFactory.getLogger(PostController.class);

	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Post> showAll()
	{
		return service.showAll();
		
	}
	@PostMapping("/add")
	public Post insertPost(@RequestBody Post post) {
		return service.insertPost(post);
	}

	@DeleteMapping("/delete/{pid}")
	public String deleteRecord(@PathVariable("pid")Integer pid) {
		service.deletePost(pid);
		return "Record deleted";
	}

	@GetMapping("/findByPid/{pid}")
	public Optional<Post> getPostId(@PathVariable("pid") Integer pid){
		return service.findPost(pid);
	}
	
	@GetMapping("findByAuthor/{author}")
	public List<Post> findAuthorData(@PathVariable("author") String author){
		return service.findByAuthor(author);
	}
	@GetMapping("findByTitle/{title}")
	public List<Post> findTitleData(@PathVariable("title") String title){
		return service.findByTitle(title);
	}
	@GetMapping("find/{title}/{author}")
	public List<Post> findTitleAuthor(@PathVariable("title") String title,
			@PathVariable("author") String author){
		return service.findByTitleAuthor(title,author);
	}
	@GetMapping("/port")
	public String getPort() {
		return service.getCommentPort();
	}
	//@CircuitBreaker(name="comments", fallbackMethod="sendDummyData")
	//@Retry(name="comments", fallbackMethod="sendDummyData")
	@Retry(name="comments")
	@GetMapping("/searchComments/{pid}")
	public List<CommentsDto> findCommentsOnPid(@PathVariable("pid")Integer pid){
		logger.info("connecting to comemnt server....");
		return service.findCommentsByPid(pid);
	}
	
	
	public List<CommentsDto> sendDummyData(Exception e){
		List<CommentsDto> data = new ArrayList<>();
		data.add(new CommentsDto());
		data.add(new CommentsDto(5002,"temp2",2002,"dummy data2"));
		data.add(new CommentsDto(5001,"temp3",2003,"dummy data3"));
		return data;
		
	}
	
}
