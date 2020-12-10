import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { FlightBookingComponent } from './flight-booking/flight-booking.component';
import { FlightCheckinSearchComponent } from './flight-checkin/flight-checkin-search/flight-checkin-search.component';
import { FlightCheckinComponent } from './flight-checkin/flight-checkin.component';
import { FlightInfoComponent } from './flight-info/flight-info.component';
import { FlightSearchResultsComponent } from './flight-search/flight-search-results/flight-search-results.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
{path:'',component:HomeComponent},
{path:'flightsinfo', component:FlightInfoComponent},
{ path:'flight-search', component:FlightSearchComponent},
{ path:'flight-checkin', component:FlightCheckinComponent},
{path: 'search-result' , component:FlightSearchResultsComponent},
{ path: 'flight-booking', component:FlightBookingComponent},
{ path:'aboutus', component:AboutusComponent},
{ path: 'contactus', component:ContactusComponent},
{ path: 'flight-checkin-search', component:FlightCheckinSearchComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
