package com.bridgelabz.bookstoreapplicationbackend_spring.exception;

import java.util.Locale;

import com.bridgelabz.bookstoreapplicationbackend_spring.util.ErrorResponse;
import com.bridgelabz.bookstoreapplicationbackend_spring.util.Response;
import org.springframework.web.bind.annotation.ResponseStatus;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@ResponseStatus
@Data
@Slf4j
public class BookStoreException extends RuntimeException {


	public BookStoreException(int statusCode, String statusMessage) {
		super(statusMessage);
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int statusCode;
	private String statusMessage;
	
	/**
	 * 
	 * @return error response
	 */
	public Response getErrorResponse() {
		log.error("Error msg:" + statusMessage);
		return getErrorResponse(Locale.getDefault());
	}
	
	/**
	 * 
	 * @param locale : locale
	 * @return : Response type
	 */
	public Response getErrorResponse(Locale locale) {
		log.error("Error msg status:" + getStatusMessage());
		ErrorResponse err = new ErrorResponse(statusCode, statusMessage, getStackTrace());
		err.setStatusCode(getStatusCode());
		err.setStatusmessage(getStatusMessage());
		return err;
	}
}
