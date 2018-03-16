package com.vy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vy.domain.User;
import com.vy.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private UserService userService;
	
	@Override
    public User findOne(int id) {
        return userService.findOne(id);
    }

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();

	}


}
