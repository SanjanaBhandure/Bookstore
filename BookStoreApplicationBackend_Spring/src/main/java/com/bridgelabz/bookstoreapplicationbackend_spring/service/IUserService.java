package com.bridgelabz.bookstoreapplicationbackend_spring.service;

import com.bridgelabz.bookstoreapplicationbackend_spring.dto.ForgotPasswordDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.dto.LoginDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.dto.UserDTO;
import com.bridgelabz.bookstoreapplicationbackend_spring.entity.UserEntity;
import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;

import java.util.List;

import javax.validation.Valid;

public interface IUserService {
	

	Response registerUserData(@Valid UserDTO dto);

	Response loginData( @Valid LoginDTO login);
	
	// To delete user
	Response deleteUser(String token);

	List<UserEntity> getAllUsers(String token);

	Response updateUser(String token, UserDTO dto);


	Response forgotPassword(@Valid ForgotPasswordDTO forgotPasswordDTO);

	Response verifyUser(String token);

}
