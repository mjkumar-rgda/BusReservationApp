package com.altimetrik.brs.entity;

import java.io.Serializable;

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
@Builder
@Getter
@ToString
@Entity
public class Passinger implements Serializable {

	private static final long serialVersionUID = 2123812913593109362L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passingerId;
	private String name;
	private String email;
	private String mobileNumber;
	private String identityType;
	private String identityNumber;
} // end of Passinger class