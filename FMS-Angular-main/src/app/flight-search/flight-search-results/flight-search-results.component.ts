import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from 'src/app/_service/booking.service';
import { FlightService } from 'src/app/_service/flight.service';

@Component({
  selector: 'app-flight-search-results',
  templateUrl: './flight-search-results.component.html',
  styleUrls: ['./flight-search-results.component.css']
})
export class FlightSearchResultsComponent implements OnInit {

  constructor(private flightService:FlightService,private bookingService: BookingService, private router: Router) { }

  flights:any
  ngOnInit(): void {
    let list = this.flightService.viewAllFlightWithSourceDestinationDate();
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
