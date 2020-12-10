import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from './footer/footer.component';
import { FlightInfoComponent } from './flight-info/flight-info.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { FlightBookingComponent } from './flight-booking/flight-booking.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { FlightSearchResultsComponent } from './flight-search/flight-search-results/flight-search-results.component';
import { FlightCheckinComponent } from './flight-checkin/flight-checkin.component';
import { FlightCheckinSearchComponent } from './flight-checkin/flight-checkin-search/flight-checkin-search.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutusComponent,
    ContactusComponent,
    FooterComponent,

    FlightInfoComponent,
    FlightSearchComponent,
    FlightSearchResultsComponent,
    
    FlightBookingComponent,

    FlightCheckinComponent,

    FlightCheckinSearchComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
