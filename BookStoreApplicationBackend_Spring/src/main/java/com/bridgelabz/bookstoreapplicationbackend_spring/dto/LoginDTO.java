package com.bridgelabz.bookstoreapplicationbackend_spring.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginDTO {

	@NotBlank(message = "Email cannot be blank")
	@Email
	private String emailId;

	@NotBlank(message = "Password cannot be blank")
	private String password;
}
