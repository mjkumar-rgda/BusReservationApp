package com.altimetrik.brs.bean;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class SearchRequest {

	@NotEmpty
	private String sourceCity;
	@NotEmpty
	private String destinationCity;
	@NotEmpty
	private String travelDate;
	
} // end of SearchRequest