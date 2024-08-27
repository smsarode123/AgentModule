package com.insurance.agent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.agent.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;
	

	
}
