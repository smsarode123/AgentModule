package com.insurance.agent.controller;

import java.util.List;

import org.apache.coyote.http2.Http2AsyncUpgradeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.agent.model.Agent;
import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;
	
	@GetMapping("/getAllAgents")
	public ResponseEntity<List<Agent>> getAllAgents(){
		
		List<Agent> list=service.getAllAgents();
		
		return new ResponseEntity<List<Agent>>(list,HttpStatus.OK);
		
	}

	@DeleteMapping("/deleteAgentById/{agentId}")
	public ResponseEntity<String> deleteAgentById(@PathVariable("agentId")int agentId){
		service.deleteAgentById(agentId);
		
		
		return new ResponseEntity<String>("deleted successfully",HttpStatus.GONE);
		
	}
	
	
}
