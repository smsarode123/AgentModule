package com.insurance.agent.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.agent.exception.InvalidAgentIdException;
import com.insurance.agent.model.Agent;
import com.insurance.agent.repository.AgentRepository;
import com.insurance.agent.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired private AgentRepository repository;

	@Override
	public List<Agent> getAllAgents() {
		
		return repository.findAll();
	}

	@Override
	public void deleteAgentById(int agentId) {
		Optional<Agent> agentRef = repository.findById(agentId);

		if (agentRef.isPresent()) {
			repository.deleteById(agentId);
		} else {
			throw new InvalidAgentIdException("Policy id " + agentId + " is not valid");

		}
		
	}

}
