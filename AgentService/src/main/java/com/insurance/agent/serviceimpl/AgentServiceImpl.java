package com.insurance.agent.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.agent.model.Agent;
import com.insurance.agent.repository.AgentRepository;
import com.insurance.agent.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService {

	@Autowired
	private AgentRepository repository;

	@Override
	public Agent saveagentdata(Agent agent) {

		Agent agentdata = repository.save(agent);

		return agentdata;

	}

}
