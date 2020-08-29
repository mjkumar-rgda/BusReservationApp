package com.altimetrik.brs.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.altimetrik.brs.bean.BookingRequest;
import com.altimetrik.brs.bean.PassingerDetails;
import com.altimetrik.brs.bean.RouteDetails;
import com.altimetrik.brs.bean.SearchRequest;
import com.altimetrik.brs.bean.SearchResponse;
import com.altimetrik.brs.bean.SearchResult;
import com.altimetrik.brs.entity.Bus;
import com.altimetrik.brs.entity.Passinger;
import com.altimetrik.brs.entity.Reservervation;
import com.altimetrik.brs.repository.BusRepository;
import com.altimetrik.brs.repository.PassingerRepository;
import com.altimetrik.brs.repository.RouteRepository;

@Service
public class BusService {

	private BusRepository busRepo;
	private PassingerRepository passingerRepo;
	private RouteRepository routeRepository;
	
	/** constructor injection.*/
	BusService(final BusRepository repo, final PassingerRepository passingerRepo,
											   final RouteRepository routeRepository) {
		this.busRepo = repo;
		this.passingerRepo = passingerRepo;
		this.routeRepository = routeRepository;
	} // end of constructor injection
	
	public SearchResponse getAvailableBusesByDate(final SearchRequest request) {

		final List<SearchResult> buses = busRepo.getAllBusByAvailability(
								 request.getSourceCity(), request.getDestinationCity(), request.getTravelDate());

		final SearchResponse response = SearchResponse.builder().result(buses).totalResult(buses.size()).build();

		return response;
	} // end of getAvailableBusesByDate

	public Reservervation bookTicket(@Valid BookingRequest request) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// store passinger Details
		final PassingerDetails PassingerRequest = request.getPassingerDetails();
		final RouteDetails routeDetails = request.getRouteDetails();
		final Passinger passinger = Passinger.builder().email(PassingerRequest.getPassingerEmail())
				.identityNumber(PassingerRequest.getPassingerIDNumber())
				.identityType(PassingerRequest.getPassingerIDType())
				.mobileNumber(PassingerRequest.getPassingerContactNumber())
				.name(PassingerRequest.getPassingerName())
				.build();
		
		final Passinger entity = passingerRepo.save(passinger);
		
		final Bus bus = busRepo.getOne(request.getRouteDetails().getBusId());
		
		final Reservervation reservervation = Reservervation.builder()
				.bookedSeats(routeDetails.getSeats())
				.bus(bus)
				.dateOfBooking(new Date(System.currentTimeMillis()))
				.passinger(entity)
				.travelDate(sdf.parse(routeDetails.getTravelDate()))
				.build();
		
		final Reservervation reservervationEntity = routeRepository.save(reservervation);
		return reservervationEntity;
	}
} // end of BusService