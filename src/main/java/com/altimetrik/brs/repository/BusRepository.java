package com.altimetrik.brs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.altimetrik.brs.bean.SearchResult;
import com.altimetrik.brs.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, String>  {
	@Query(value = "SELECT b.bus_id, b.bus_number, b.operator_name, b.departure_time, b.arrival_time, b.duration, "
			+ "b.price from brss.BUS b, brss.bus_route_by_date br where b.bus_id = br.bus_id and "
			+ "upper(b.source) = :source and upper(b.destination) = :destination and br.date like :travelDate "
			+ "order by price asc", nativeQuery = true)
	List<SearchResult> getAllBusByAvailability(final String source, String destination, String travelDate);
} // end of BusRepository