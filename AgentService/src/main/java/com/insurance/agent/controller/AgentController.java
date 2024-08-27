package com.insurance.agent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.agent.model.Agent;
import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;
	
	public ResponseEntity<List<Agent>> getAllAgents(){
		List<Agent> list=service.getAllAgents();
		
		return new ResponseEntity<List<Agent>>(list,HttpStatus.OK);
		
	}

	
}
