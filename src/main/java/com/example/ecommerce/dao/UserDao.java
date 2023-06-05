package com.example.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ecommerce.models.User;

public interface UserDao extends CrudRepository<User, Long> {

}
