import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FlightService } from '../_service/flight.service';

@Component({
  selector: 'app-flight-search',
  templateUrl: './flight-search.component.html',
  styleUrls: ['./flight-search.component.css']
})
export class FlightSearchComponent implements OnInit {

  constructor(private flightService:FlightService, private router: Router) { }

  source:any;
  destination:any;
  date:any;

  ngOnInit(): void {
  }

  redirectToFlightSearchResults(){
    console.log(this.source);
    console.log(this.destination);
    console.log(this.date);
    this.flightService.source = this.source;
    this.flightService.destination = this.destination;
    this.flightService.date = this.date;
    this.router.navigate(["/search-result"]);

  }

}
