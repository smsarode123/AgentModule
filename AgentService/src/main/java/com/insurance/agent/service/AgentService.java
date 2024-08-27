package com.insurance.agent.service;

import java.util.List;


import com.insurance.agent.model.Agent;

public interface AgentService {

	public List<Agent> getAllAgents();

	public Agent getSingleAgent(int agentId);

	public Agent saveagentdata(Agent agent);

}
