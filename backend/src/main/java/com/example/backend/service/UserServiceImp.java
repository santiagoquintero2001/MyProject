package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
@Service

public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> list() {
		
		return repository.findAll();
	}
	
	public User findById(Integer id_usuario) {
		User user = repository.findById(id_usuario).orElse(null);
		return user;
	}

	@Override
	public User listId(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User add(User u) {
		return repository.save(u);
	}

	@Override
	public User edit(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(int id_usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}