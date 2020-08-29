package com.altimetrik.brs.bean;

import javax.validation.constraints.NotEmpty;

import lombok.Data;


/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class RouteDetails {

	@NotEmpty
	private String busId;
	@NotEmpty
	private String travelDate;

	private String[] seats;
	
} // end of BookingRequest