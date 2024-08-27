package com.insurance.agent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agentId;
	private String agentName;
	private String agentAddress;
	private long agentContactNumber;
	private String agentCenter;

}
