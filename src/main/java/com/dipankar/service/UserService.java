package com.dipankar.service;

import com.dipankar.exception.UserException;
import com.dipankar.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
