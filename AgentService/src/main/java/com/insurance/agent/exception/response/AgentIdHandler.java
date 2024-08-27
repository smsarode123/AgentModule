package com.insurance.agent.exception.response;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.insurance.agent.dto.ErrorResponse;
import com.insurance.agent.exception.InvalidAgentIdException;

public class AgentIdHandler {

	public ResponseEntity<ErrorResponse> AgentIdErrorHandler(InvalidAgentIdException agent) 
	{
		
		ErrorResponse response=new ErrorResponse(agent.getMessage(),agent.getClass().getName(),new Date(),404);
		
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
}
