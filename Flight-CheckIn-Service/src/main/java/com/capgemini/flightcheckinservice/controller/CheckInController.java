package com.capgemini.flightcheckinservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.flightcheckinservice.entity.CheckIn;
import com.capgemini.flightcheckinservice.service.CheckInService;


@RestController
@CrossOrigin("*")
public class CheckInController {

	@Autowired
	CheckInService checkInService;
	
	@GetMapping("/checkin/getAll")
	public List<CheckIn> getAllCheckIn(){
		return checkInService.getAllCheckIn();
	}

    @GetMapping("/checkin/{cId}")
    private CheckIn getById(@PathVariable int cId) {
    	if(cId == 0 ) {
    		throw new NullPointerException("Enter a valid CheckIn Id");
    	}
        return checkInService.getCheckIn(cId);
    }
    
    @PostMapping("/checkin")
    private boolean createCheckIn(@RequestBody CheckIn checkIn) {
    	checkInService.addCheckIn(checkIn);
    	return true;
    }
}
