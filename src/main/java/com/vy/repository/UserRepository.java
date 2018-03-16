package com.vy.repository;

import org.springframework.data.repository.CrudRepository;

import com.vy.domain.User;

import antlr.collections.List;

public interface UserRepository extends CrudRepository<User, Integer> {

}
