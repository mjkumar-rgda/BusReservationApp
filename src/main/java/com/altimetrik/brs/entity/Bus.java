package com.altimetrik.brs.entity;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Getter
@Builder
@ToString
@Entity
public class Bus implements Serializable {

	private static final long serialVersionUID = 8969328127927352690L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer busId;
	private String busNumber;
	private String operatorName;
	private String source;
	private String destination;
	private Time departureTime;
	private Time arrivalTime;
	private Double duration;
	private Double price;
	private String[] seats;
} // end of Bus entity