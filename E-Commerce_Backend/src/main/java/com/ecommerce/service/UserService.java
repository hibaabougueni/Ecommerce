package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.UserException;
import com.ecommerce.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	public User findUserProfileByJwt(String jwt) throws UserException;
	public List<User> findAll(String jwt) throws UserException;

}
