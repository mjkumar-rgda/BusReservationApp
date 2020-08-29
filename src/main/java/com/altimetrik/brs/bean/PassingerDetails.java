package com.altimetrik.brs.bean;

import javax.validation.constraints.NotEmpty;

import lombok.Data;


/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class PassingerDetails {

	@NotEmpty
	private String passingerName;
	@NotEmpty
	private String passingerContactNumber;
	@NotEmpty
	private String passingerIDType;
	@NotEmpty
	private String passingerIDNumber;
	private String passingerEmail;
	
} // end of UserDetails