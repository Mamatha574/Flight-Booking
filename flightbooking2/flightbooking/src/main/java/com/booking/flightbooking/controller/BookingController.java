package com.booking.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.service.BookingService;

@RestController
@CrossOrigin("*")
public class BookingController {
	
	@Autowired
	BookingService bookingService;

   

    @GetMapping("/booking/{bId}")
    private BookingBean getBookingInfo(@PathVariable("bId") int bId) {
    	if(bId == 0 ) {
    		throw new NullPointerException("Enter a valid Booking Id");
    	}
        return bookingService.getBookingInfo(bId);
    }

    @DeleteMapping("/booking/{bId}")
    private void cancelBooking(@PathVariable("bId") int bId) {
    	if(bId == 0 ) {
    		throw new NullPointerException("Enter a valid Booking Id");
    	}
         bookingService.cancelBooking(bId);
    }

    @PostMapping("/booking")
    private String createBooking(@RequestBody BookingBean booking) {
    	return bookingService.createBooking(booking);
    }
    
    @GetMapping("/booking/checkin")
    public BookingBean checkin(@RequestParam int bookingId) {
    	return bookingService.checkin(bookingId);
    }
   
}