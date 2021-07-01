package com.example.back.service;

import java.util.List;

import com.example.back.entity.User;

public interface UserService {
	List<User>list();
	User listId(int id_usuario);
	User add(User u);
	User edit(User u);
	User delete(int id_usuario);
	

}
