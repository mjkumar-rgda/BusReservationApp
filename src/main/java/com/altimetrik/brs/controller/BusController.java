package com.altimetrik.brs.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.altimetrik.brs.bean.BookingRequest;
import com.altimetrik.brs.bean.SearchRequest;
import com.altimetrik.brs.bean.SearchResponse;
import com.altimetrik.brs.entity.Reservervation;
import com.altimetrik.brs.service.BusService;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class BusController {

	private BusService service;

	/** Constructor Injection. */
	BusController(BusService service) {
		this.service = service;
	} // end of constructor

	/**
	 * display all buses in user specify details.
	 */
	@PostMapping("/v1/bus/search")
	public ResponseEntity<SearchResponse> getAllBuses(@RequestBody @Valid final SearchRequest request) {

		log.info("Request Received : {}", request);
		final SearchResponse responseBean = service.getAvailableBusesByDate(request);

		return new ResponseEntity<>(responseBean, HttpStatus.OK);
	} // end of getAllBuses method
	
	/**
	 * api for booking tickets.
	 * 
	 * @throws ParseException
	 */
	@PostMapping("/v1/bus/book")
	public ResponseEntity<Reservervation> bookTicket(@RequestBody @Valid final BookingRequest request)
			throws ParseException {

		log.info("Request Received : {}", request);
		final Reservervation responseBean = service.bookTicket(request);

		return new ResponseEntity<>(responseBean, HttpStatus.OK);
	} // end of bookTicket method
} // end of BusController class 