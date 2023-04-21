package com.example.postservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postservice.dao.PostDao;
import com.example.postservice.model.CommentsDto;
import com.example.postservice.model.CommentsProxy;
import com.example.postservice.model.Post;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	RestTemplate temp;
	@Autowired
	CommentsProxy template;
	
	@Autowired
	PostDao dao;
	@Override
	public List<Post> showAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}
	@Override
	public Optional<Post> findPost(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public void deletePost(Integer pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
	}

	@Override
	public List<Post> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}

	@Override
	public List<Post> findByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}

	@Override
	public List<Post> findByTitleAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return dao.findByTitleAndAuthor(title, author);
	}
	
	@Override
	public List<CommentsDto> findCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		
		return template.getByPid(pid);
		//return temp.getForObject("http://localhost:8090/findByPid/"+pid, List.class);
		//return temp.getForObject("http://COMMENT-SERVICE/comments/findCommentsByPid/"+pid, List.class);
		//return null;
	//	System.out.println("connecting to comment service.....");
		//return template.getByPid(pid);
	}
	@Override
	public String getCommentPort() {
		// TODO Auto-generated method stub
		//return temp.getForObject("http://COMMENT-SERVICE/comments/port",String.class);
		return template.getPort();
	}


}
