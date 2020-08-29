package com.altimetrik.brs.bean;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Builder
@Data
public class AgentLogInResponse implements Serializable {

	private static final long serialVersionUID = -7425093080704079511L;
	private String userName;
	private String token;
} // end of SearchResult