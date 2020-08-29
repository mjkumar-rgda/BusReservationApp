package com.altimetrik.brs.bean;

import javax.validation.constraints.NotNull;

import lombok.Data;


/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class BookingRequest {

	@NotNull
	private PassingerDetails passingerDetails;
	
	@NotNull
	private RouteDetails routeDetails;
	
} // end of BookingRequest