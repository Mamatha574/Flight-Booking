import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { CheckIn } from 'src/app/checkin';
import { BookingService } from 'src/app/_service/booking.service';
import { CheckInService } from 'src/app/_service/checkin.service';
import { FlightService } from 'src/app/_service/flight.service';

@Component({
  selector: 'app-flight-checkin-search',
  templateUrl: './flight-checkin-search.component.html',
  styleUrls: ['./flight-checkin-search.component.css']
})
export class FlightCheckinSearchComponent implements OnInit {

  message: any;

  confirmationMessage: any;
  bookingData: any;
  flightData: any;
  checkInEntity:CheckIn;

  constructor(private bookingService: BookingService, private flightService: FlightService, private checkInService: CheckInService, private router:Router) { }

  ngOnInit(): void {
  }

  

  checkIn(form: NgForm) {
    var bookingId = form.value.bookingReference;

    let getBooking = this.bookingService.getBooking(bookingId);
    getBooking.subscribe((data) => {
      this.bookingData = data;
    
      let getFlight = this.flightService.getFlightById(this.bookingData.flightId);

      getFlight.subscribe((data) => {

        this.flightData = data;
        this.message = this.flightData.flightName+"  "+this.flightData.source+"  "+this.flightData.destination+"  "+this.flightData.date+"    "+this.bookingData.firstName+" "+this.bookingData.lastName;
      
      },
        (error) => {
          console.log(error);
        })
    },
      (error) => {
        console.log(error);
      });

  }

  checkInConfirm(){
    this.message = null;
    this.confirmationMessage = "Checked In Successfully!!"

    console.log(this.bookingData);
    this.checkInEntity = new CheckIn();
    this.checkInEntity.bId = this.bookingData.bId;
    let postCheckIn = this.checkInService.postCheckIn(this.checkInEntity);
    postCheckIn.subscribe((data)=>{
      let bookingStatus = this.bookingService.checkIn(this.bookingData.bId);
      bookingStatus.subscribe((data) => {
        setTimeout(() => {
          this.message = null;
          this.router.navigate(["/flight-checkin"]);
        }, 5000)
      });
    },
    (error)=>console.log(error));


    
  }

}
