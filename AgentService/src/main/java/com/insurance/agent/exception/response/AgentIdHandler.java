package com.insurance.agent.exception.response;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.insurance.agent.dto.ErrorResponse;
import com.insurance.agent.exception.InvalidAgentIdException;
@RestControllerAdvice
public class AgentIdHandler {
	
    @ExceptionHandler (InvalidAgentIdException.class)
	public ResponseEntity<ErrorResponse> AgentIdErrorHandler(InvalidAgentIdException agent) 
	{
		ErrorResponse response = new ErrorResponse(agent.getMessage(), agent.getClass().getName(), new Date(), 404);
		
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
}
