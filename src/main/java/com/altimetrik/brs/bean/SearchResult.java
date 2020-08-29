package com.altimetrik.brs.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Data
public class SearchResult implements Serializable {

	private static final long serialVersionUID = -7425093080704079511L;
	private String busId;
	private String busNumber;
	private String operatorName;
	private String departureTime;
	private String arrivalTime;
	private Double duration;
	private Double price;
} // end of SearchResult