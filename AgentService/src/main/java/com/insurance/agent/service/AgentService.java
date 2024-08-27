package com.insurance.agent.service;


import java.util.List;


import com.insurance.agent.model.Agent;

public interface AgentService {


	Agent saveagentdata(Agent agent);

	List<Agent> getAllAgents();


}
