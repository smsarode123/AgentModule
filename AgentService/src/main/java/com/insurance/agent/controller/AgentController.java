package com.insurance.agent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.agent.model.Agent;
import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;
	
	
	@GetMapping("/getSingleAgent/agentId")
	public ResponseEntity<Agent> getSingleAgent(@PathVariable("agentId") int agentId)
	{
		Agent agentRef = service.getSingleAgent(agentId);
		
		return new ResponseEntity<Agent>(agentRef, HttpStatus.FOUND);
	}

	
}
