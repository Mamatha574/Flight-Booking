package com.booking.flightbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table (name = "Booking")
public class BookingBean {

    @Id
    @Column
    int bId;
	@Column
    String flightId;
    @Column
    String firstName;
    @Column
    String lastName;
    @Column
    String gender;
    @Column
    boolean checkIn;

    public BookingBean() {

    }

	public BookingBean(String flightId, String firstName, String lastName, String gender, boolean checkIn) {
		super();
		this.flightId = flightId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.checkIn = checkIn;
		
	}
	
	

	public BookingBean(int bId, String flightId, String firstName, String lastName, String gender, boolean checkIn) {
		super();
		this.bId = bId;
		this.flightId = flightId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.checkIn = checkIn;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	
	

}