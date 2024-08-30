package com.insurance.agent.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	
	private String message;
	private String className;
	private Date responseDate;
	private int statusCode;
	

}