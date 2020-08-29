package com.altimetrik.brs.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class BusRouteByDate implements Serializable {

	private static final long serialVersionUID = 8969328127927352690L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer routeId;
	@ManyToOne
	@JoinColumn(nullable = false, name = "busId", updatable = true, insertable = true)
	@ToString.Exclude
	private Bus bus;
	private Date date;
	private String[] availableSeats;
} // end of Bus entity