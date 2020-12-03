package com.booking.flightbooking.service;


import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.exception.FBException;
import com.booking.flightbooking.repository.BookingRepository;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImp implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
    
   public String createBooking(BookingBean bean){
	   
	   Random rand = new Random(); 
	   int random = rand.nextInt(1000);
	   bean.setbId(random);
	  
	   
	   if(bookingRepository.save(bean) != null) {
      
       		return random+"";
		}
		else {
			throw new FBException("Failed to add Booking-in Info");
		}

    }

   public void cancelBooking(int bId){
       bookingRepository.deleteById(bId);

    }

    public BookingBean getBookingInfo(int bId) {
      return bookingRepository.findById(bId).get();
    }

	public BookingBean checkin(int bookingId) {
		
		BookingBean booking = bookingRepository.findById(bookingId).get();
		
		booking.setCheckIn(true);
		
		bookingRepository.save(booking);
		
		return booking;
	}
}
