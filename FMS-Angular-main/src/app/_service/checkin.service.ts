
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CheckIn } from '../checkin';

@Injectable({
  providedIn: 'root'
})
export class CheckInService {

 

  checkInURL:string = "http://ec2-13-233-136-19.ap-south-1.compute.amazonaws.com:8080/checkin-service"

  constructor(private http:HttpClient) { }

  public getCheckInById(cId) :Observable<any>{
    return this.http.get( this.checkInURL+'/checkin/'+cId);
  }

  public postCheckIn(checkIn: CheckIn){
    return this.http.post(this.checkInURL+'/checkin',checkIn);
  }

  public getAllCheckIn(){
    return this.http.get(this.checkInURL+'/checkin/getAll');
  }

  

}
