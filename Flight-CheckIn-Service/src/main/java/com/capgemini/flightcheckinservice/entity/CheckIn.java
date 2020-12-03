package com.capgemini.flightcheckinservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CheckIn {
	@Id
	@Column
	@GeneratedValue
	private int cId;
	@Column
	private int bId;
	@Column
    private String seatNumber;
	@Column
    private Date checkInTime;
	
	public CheckIn() {}
	
	public CheckIn(int cId, int bId, String seatNumber, Date checkInTime) {
		super();
		this.cId = cId;
		this.bId = bId;
		this.seatNumber = seatNumber;
		this.checkInTime = checkInTime;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	
	
	

}
