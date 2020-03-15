package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExcetionHandler extends ResponseEntityExceptionHandler {
	
		@ExceptionHandler(StudentNotFoundException.class)
		public ResponseEntity<ErrorResponse> handleStudentNotFoundException(StudentNotFoundException ex, WebRequest request) {
			
			ErrorResponse response =new ErrorResponse("Student Not Found", ex.getMessage());
			 return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
		}
}
