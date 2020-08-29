package com.altimetrik.brs.bean;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class AgentRequest {
	@NotEmpty
	private String userName;
	
	//password should be encrypt in request payload.
	@NotEmpty
	private String password;
} // end of SearchRequest