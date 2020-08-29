package com.altimetrik.brs.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@Builder
@Data
public class SearchResponse implements Serializable {

	private static final long serialVersionUID = -7425093080704079511L;
	private List<SearchResult> result;
	private int totalResult;
} // end of SearchResult