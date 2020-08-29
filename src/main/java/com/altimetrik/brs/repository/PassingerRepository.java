package com.altimetrik.brs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.brs.entity.Passinger;

@Repository
public interface PassingerRepository extends JpaRepository<Passinger, String>  {
} // end of BusRepository