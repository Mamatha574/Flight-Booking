package com.capgemini.flightcheckinservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.flightcheckinservice.entity.CheckIn;

@Repository
public interface CheckInRepository extends CrudRepository<CheckIn, Integer>{

}
