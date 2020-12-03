package com.capgemini.flightcheckinservice.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flightcheckinservice.entity.CheckIn;
import com.capgemini.flightcheckinservice.exception.CheckInException;
import com.capgemini.flightcheckinservice.repository.CheckInRepository;

@Service
public class CheckInServiceImpl implements CheckInService{

	@Autowired
	CheckInRepository checkinRepository;
	
	@Override
	public CheckIn getCheckIn(int cId) {
		
		return checkinRepository.findById(cId).get();
	}

	@Override
	public boolean addCheckIn(CheckIn checkIn){
		
		        checkIn.setCheckInTime(new Date());// set time for checkin
		        
		        Random rand = new Random(); 
		        
				int random = rand.nextInt(200); 
				
				String seat = (char)(rand.nextInt(26) +'A')+" "+random+""+(char)(rand.nextInt(3) +'a');
				
				checkIn.setSeatNumber(seat);
				
		        if(checkinRepository.save(checkIn) != null) {
		        	checkIn.getcId();
		        	return true;
				}
				else {
					throw new CheckInException("fail to add Check-in Information");
				}
		       
		    }

	@Override
	public List<CheckIn> getAllCheckIn() {
	
		return (List<CheckIn>) checkinRepository.findAll();
	}

}
