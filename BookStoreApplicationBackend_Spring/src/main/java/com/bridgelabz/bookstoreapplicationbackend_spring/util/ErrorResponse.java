package com.bridgelabz.bookstoreapplicationbackend_spring.util;

public class ErrorResponse extends Response {

	public ErrorResponse(Integer statusCode, String statusmessage, Object token) {
		super(statusCode, statusmessage, token);
		// TODO Auto-generated constructor stub
	}
}
