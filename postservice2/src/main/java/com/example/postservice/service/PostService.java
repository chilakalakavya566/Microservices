package com.example.postservice.service;

import java.util.List;
import java.util.Optional;

import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.Post;

public interface PostService {
	
	public List<CommentsDto> findCommentsByPid(int pid);
	public List<Post> showAll();
	public Post insertPost(Post post);
	public Optional<Post> findPost(Integer pid);
	public void deletePost(Integer pid);
	public List<Post> findByAuthor(String author);
	public List<Post> findByTitle(String title);
	public List<Post> findByTitleAuthor(String title,String author);
	public String getCommentPort();
}
