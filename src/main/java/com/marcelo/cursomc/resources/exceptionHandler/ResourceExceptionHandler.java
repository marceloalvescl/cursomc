package com.marcelo.cursomc.resources.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.marcelo.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException onfe){
		
		
		
		return null;
	}
	
}
