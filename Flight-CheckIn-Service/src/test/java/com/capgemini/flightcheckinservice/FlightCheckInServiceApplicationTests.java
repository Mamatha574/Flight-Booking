package com.capgemini.flightcheckinservice;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.flightcheckinservice.entity.CheckIn;
import com.capgemini.flightcheckinservice.repository.CheckInRepository;
import com.capgemini.flightcheckinservice.service.CheckInService;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightCheckInServiceTest {


	@Autowired
	private CheckInService service;

	@MockBean
	private CheckInRepository repository;
	
	@Test
	public void addcheckInTest() {
	//Date date = new Date();
		CheckIn checkIn = new CheckIn(11, 11, "21", new Date());
		when(repository.save(checkIn)).thenReturn(checkIn);

		assertTrue(service.addCheckIn(checkIn));	

	}

}
