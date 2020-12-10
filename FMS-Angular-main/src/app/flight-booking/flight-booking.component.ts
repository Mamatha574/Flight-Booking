import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../_service/booking.service';

@Component({
  selector: 'app-flight-booking',
  templateUrl: './flight-booking.component.html',
  styleUrls: ['./flight-booking.component.css']
})
export class FlightBookingComponent implements OnInit {

  message: any;
  booking:Booking;
  flightMessage:string = "";

  constructor(private bookingService: BookingService, private router:Router) { }


  ngOnInit(): void {
    console.log(this.bookingService.flightId);
    if(this.bookingService.flightName && this.bookingService.flightSource && this.bookingService.flightDestination && this.bookingService.flightDate){
      this.flightMessage = this.bookingService.flightName+" "+this.bookingService.flightSource+" "+this.bookingService.flightDestination+" "+this.bookingService.flightDate;
    }
    
  }

  bookTicket(form: NgForm) {
    
    this.booking = new Booking();
    this.booking.flightId = this.bookingService.flightId;
    this.booking.firstName = form.value.firstName;
    this.booking.lastName = form.value.lastName;
    this.booking.gender = form.value.gender;

    console.log(this.booking);

    let postBooking = this.bookingService.confirmBooking(this.booking);
    postBooking.subscribe((response) => {
      this.flightMessage = null;
       
        if (response) {
          this.message = "Your Booking is confirmed. Reference Number is "+response;
          setTimeout(() => {
            this.message = null;
            this.router.navigate(["/"]);
          }, 6000)
        
        }
      }, error => {
        console.log(error);
      });

  }
}

