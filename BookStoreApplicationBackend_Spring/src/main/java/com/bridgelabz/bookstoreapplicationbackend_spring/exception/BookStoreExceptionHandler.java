package com.bridgelabz.bookstoreapplicationbackend_spring.exception;

import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class BookStoreExceptionHandler {

	/**
	 * Exception handler method to handle custom UserRegisterException
	 * @param e : Exception
	 * @return : ResponseEntity<Response>
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handleException(Exception e){
		log.error(e.getMessage(), e);
		BookStoreException he = new BookStoreException(100, e.getMessage());
		return new ResponseEntity<>(he.getErrorResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
