package com.pack.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.pack.model.Response;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Response> handleException(RuntimeException ex)
	{
		return new ResponseEntity<>(new Response(ex.getMessage(),ex.getLocalizedMessage()),HttpStatus.BAD_REQUEST);
	}
}
