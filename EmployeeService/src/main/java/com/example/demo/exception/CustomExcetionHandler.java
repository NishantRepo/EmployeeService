package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExcetionHandler extends ResponseEntityExceptionHandler {
	
		@ExceptionHandler(StudentNotFoundException.class)
		public ErrorResponse handleStudentNotFoundException(StudentNotFoundException ex, WebRequest request) {
			
			return new ErrorResponse("Student Not Found", ex.getLocalizedMessage());
		}
}
