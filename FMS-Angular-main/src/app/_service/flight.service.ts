import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  flightURL:string = "http://ec2-13-233-136-19.ap-south-1.compute.amazonaws.com:8080/flight-search/flight_management";

  source:string = "";
  destination:string ="";
  date:string="";

  constructor(private http:HttpClient) { }

  public viewAllFlights(){
    return this.http.get(this.flightURL+"/viewAllFlights");
  }

  public viewAllFlightWithSourceDestinationDate(){
    return this.http.get(this.flightURL+"/getFlightBySourceDestinationDate?source="+this.source+"&&destination="+this.destination+"&&date="+this.date);
  }
  //getFlightById
  public getFlightById(id){
    return this.http.get(this.flightURL+"/getFlightById?id="+id);
  }


}
