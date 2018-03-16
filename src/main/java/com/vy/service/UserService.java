package com.vy.service;

import java.util.List;

import com.vy.domain.User;

public interface UserService {

	Iterable<User> findAll();

	User findOne(int id);



}
