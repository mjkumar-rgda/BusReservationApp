package com.altimetrik.brs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Builder
@Getter
@ToString
@Entity
public class Agent implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agentId;
	private String name;
	private String email;
	private String mobileNumber;
	@Column(unique = true)
	private String userName;
	@JsonIgnore
	private String password;
} // end of Passinger class