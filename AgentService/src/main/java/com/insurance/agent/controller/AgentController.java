package com.insurance.agent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.agent.model.Agent;
import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {

	@Autowired
	AgentService service;

	@PostMapping("/saveagent")
	public ResponseEntity<Agent>saveagentdata(@RequestBody Agent agent)
	{
		Agent agentdata=service.saveagentdata(agent);
		
		return new ResponseEntity<Agent>(agentdata, HttpStatus.OK);
	}

	@GetMapping("/getAllAgents")
	public ResponseEntity<List<Agent>> getAllAgents() {

		List<Agent> list = service.getAllAgents();

		return new ResponseEntity<List<Agent>>(list, HttpStatus.OK);

	}

	@DeleteMapping("/deleteAgentById/{agentId}")

	public ResponseEntity<String> deleteAgentById(@PathVariable("agentId") int agentId) {
		service.deleteAgentById(agentId);

		return new ResponseEntity<String>("deleted successfully", HttpStatus.GONE);

	}

	@GetMapping("/getSingleAgent/{agentId}")
	public ResponseEntity<Agent> getSingleAgent(@PathVariable("agentId") int agentId)
	{
		Agent agentRef = service.getSingleAgent(agentId);
		
		return new ResponseEntity<Agent>(agentRef, HttpStatus.FOUND);

	}
	
	@PutMapping("/putagetn/{agentId}")
	public ResponseEntity<Agent>updateagentdata(@PathVariable ("agentId") int agentid,@RequestBody Agent agent)
	{
		
		Agent agentdata=service.updateagentdata(agentid,agent);
		
		return new ResponseEntity<Agent>(agentdata, HttpStatus.CREATED);
	}

}
