import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from '../_service/booking.service';
import { FlightService } from '../_service/flight.service';

@Component({
  selector: 'app-flight-info',
  templateUrl: './flight-info.component.html',
  styleUrls: ['./flight-info.component.css']
})
export class FlightInfoComponent implements OnInit {

  flights:any;

  constructor(private flightService:FlightService, private bookingService: BookingService, private router: Router) { }

  ngOnInit(): void {
    let list = this.flightService.viewAllFlights();
    list.subscribe((data) => this.flights = data);
  }

  booking(index){
    this.bookingService.flightId = this.flights[index].flightId;
    this.bookingService.flightName = this.flights[index].flightName;
    this.bookingService.flightSource = this.flights[index].source;
    this.bookingService.flightDestination = this.flights[index].destination;
    this.bookingService.flightDate = this.flights[index].date;

    this.router.navigate(["/flight-booking"]);
    
  }
  
}

