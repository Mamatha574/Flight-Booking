package com.booking.flightbooking.service;

import com.booking.flightbooking.entity.BookingBean;

public interface BookingService {

   public  String createBooking(BookingBean bean);

    public void cancelBooking(int bId);

    public BookingBean getBookingInfo(int bId);

	public BookingBean checkin(int bookingId);

}
