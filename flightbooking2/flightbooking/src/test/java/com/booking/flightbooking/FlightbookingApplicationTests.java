package com.booking.flightbooking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.repository.BookingRepository;
import com.booking.flightbooking.service.BookingService;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightbookingApplicationTests {


		@Autowired
		private BookingService service;

		@MockBean
		private BookingRepository repository;
		
		@Test
		public void createBookingTest() {
			BookingBean booking = new BookingBean(101, "121", "Sushma", "Kusuma", "Female", false);
			when(repository.save(booking)).thenReturn(booking);

			assertNotEquals(null, service.createBooking(booking));

		}
		
//		@Test
//		public void getBookingTest() {
//			BookingBean booking = booking.getbId();
//		       bookingRepository.findById(bId).get();
//	    }
//			BookingBean booking = getBI(101, 121, "Sushma", "Kusuma", "Female", false);
//			when(repository.findById(bId).get()).thenReturn(booking);
//
//			assertTrue(service.createBooking(booking));	
//
//		}


		@Test
		public void getBookingTest() {
			
			BookingBean booking = new BookingBean(102, "122", "Sushma", "Kusuma", "Female", false);
			when(repository.findById(102)).thenReturn(Optional.of(booking));
			
			assertEquals(booking ,service.getBookingInfo(102));
			
		}
		
//		@Test
//		public void cancelBookingTest() {
//			
//			BookingBean booking = new BookingBean(103, 123, "Sushma", "Kusuma", "Female", false);
//			when(repository.findById(103)).thenReturn(Optional.of(booking));
//			
//			assertEquals(booking ,service.cancelBooking(103));
//			
//		}
	}
	
	
