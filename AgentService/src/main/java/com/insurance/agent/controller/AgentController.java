package com.insurance.agent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.agent.model.Agent;
import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;
	
	
    @PostMapping("/saveagent")
    public ResponseEntity<Agent>Postdata(@RequestBody Agent agent)
    {
    	
    	Agent agentdata=service.saveagentdata(agent);
    	
    	return new ResponseEntity<Agent>(agentdata, HttpStatus.OK);
    }
	
	

	
}
