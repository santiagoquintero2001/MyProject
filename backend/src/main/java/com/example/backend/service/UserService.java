package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.User;

public interface UserService {
	User listId(int id_usuario);
	User add(User u);
	User edit(User u);
	User delete(int id_usuario);
	List<User> list();
	

}