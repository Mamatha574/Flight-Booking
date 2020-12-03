package com.capgemini.flightcheckinservice.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CheckInExceptionHandler {

	
	private String errorMsg = "Some thing went wrong!";
	
	@ExceptionHandler(CheckInException.class)
	public final ResponseEntity<ErrorMessage> RecordNotFound(CheckInException ex){

		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						errorMsg);
		return new ResponseEntity<ErrorMessage>(exceptionResponse,
				new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public final ResponseEntity<ErrorMessage> NullValueException(NullPointerException ex){

		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						errorMsg);
		return new ResponseEntity<ErrorMessage>(exceptionResponse,
				new HttpHeaders(),HttpStatus.NOT_FOUND);
	}
}
