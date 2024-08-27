package com.insurance.agent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.agent.model.Agent;
@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer>{

}
