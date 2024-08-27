package com.insurance.agent.service;

import java.util.List;


import com.insurance.agent.model.Agent;

public interface AgentService {

	

	public Agent getSingleAgent(int agentId);

	public Agent saveagentdata(Agent agent);

	void deleteAgentById(int agentId);

	List<Agent> getAllAgents();

	public Agent updateagentdata(int agentid, Agent agent);

}
