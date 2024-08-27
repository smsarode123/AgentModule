package com.insurance.agent.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.agent.repository.AgentRepository;
import com.insurance.agent.service.AgentService;

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired private AgentRepository repository;

}
