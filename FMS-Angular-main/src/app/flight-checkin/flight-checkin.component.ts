import { Component, Input, OnInit } from '@angular/core';
import { CheckIn } from '../checkin';
import { CheckInService } from '../_service/checkin.service';

@Component({
  selector: 'app-flight-checkin',
  templateUrl: './flight-checkin.component.html',
  styleUrls: ['./flight-checkin.component.css']
})
export class FlightCheckinComponent implements OnInit {
  // @Input() checkin: CheckIn;

  checkInList:any;

  constructor(private checkInService: CheckInService) { }
  
  ngOnInit(): void {
    this.checkInService.getAllCheckIn().subscribe((data)=>this.checkInList=data);
  }

}
