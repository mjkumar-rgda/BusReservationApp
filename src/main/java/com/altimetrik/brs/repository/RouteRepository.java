package com.altimetrik.brs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.brs.entity.Reservervation;

@Repository
public interface RouteRepository extends JpaRepository<Reservervation, String>  {
} // end of BusRepository