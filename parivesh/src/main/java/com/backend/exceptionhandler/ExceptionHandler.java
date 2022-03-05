package com.backend.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.backend.exceptions.UserAlreadyExistException;
import com.backend.exceptions.UserNotFoundException;

@Component
@RestControllerAdvice
public class ExceptionHandler {

//	@org.springframework.web.bind.annotation.ExceptionHandler(value = BadRequestException.class)
//	public ResponseEntity<Object> exception(BadRequestException exception) {
//		return new ResponseEntity<>("User input is not correct", HttpStatus.BAD_REQUEST);
//	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});

		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleUserNotFoundException(UserNotFoundException ex) {
		Map<String, String> errors = new HashMap<>();
		errors.put("ErrorMessage", ex.getMessage());
		return new ResponseEntity<>(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<Map<String, String>> handleUserAlreadyExistException(UserAlreadyExistException ex) {
		Map<String, String> errors = new HashMap<>();
		errors.put("ErrorMessage", ex.getMessage());
		return new ResponseEntity<>(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, String>> handleAnyException(Exception ex) {
		Map<String, String> errors = new HashMap<>();
		errors.put("ErrorMessage", ex.getMessage());
		return new ResponseEntity<>(errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
