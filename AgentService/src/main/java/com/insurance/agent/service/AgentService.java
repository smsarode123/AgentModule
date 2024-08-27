package com.insurance.agent.service;

import java.util.List;

import com.insurance.agent.model.Agent;

public interface AgentService {

	List<Agent> getAllAgents();

	void deleteAgentById(int agentId);

}
