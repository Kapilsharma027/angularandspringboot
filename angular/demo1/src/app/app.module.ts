import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatSelectModule} from '@angular/material/select';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { SecondComponent } from './second/second.component';
import { HeaderModule } from './module/header/header.module';
@NgModule({
  declarations: [
    AppComponent,
    SecondComponent
  ],
  imports: [
    HeaderModule,///imported
    MatSelectModule,
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
