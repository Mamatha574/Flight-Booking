package com.capgemini.flightcheckinservice.service;

import java.util.List;

import com.capgemini.flightcheckinservice.entity.CheckIn;

public interface CheckInService {

	public CheckIn getCheckIn(int cId);
	public boolean addCheckIn(CheckIn checkIn);
	public List<CheckIn> getAllCheckIn();
}
