

import { Component } from '@angular/core';
import { AppService } from './app.service';
import { PaginateOptions, PageState } from 'ngx-paginate';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  data:  Observable<string[]>;
  pageIndex: number;
  last = 10;
  first = 0;
  itemperpage = 10;
  Entries = [5, 10, 15, 20];
  p: number = 1;
  dataCount = 0;
  config: any;
  pagesize = 10;
  // page: PageState = {
  //   currentPage: 1,
  //   pageSize: this.pagesize,
  //   totalItems: 55
  // };
  currentChange;
  textToShow: string;

  /**
   * @param  {AppService} privateappService
   */
  constructor(private appService: AppService
  ) {
    this.getAuthorData(1, this.pagesize);
      this.config = {
        itemsPerPage: this.itemperpage,
        currentPage: this.pagesize,
        totalItems: 100
      };


  }

  /**
   * @param  {any} data data
   */
  setPage(data: any) {
    console.log("console on change");
  }
// change comments
  change(eve: any) {
    console.log(eve);
    this.config.currentPage = eve;
    this.getAuthorData();
  }

  getAuthorData(pagenumber , pagesize) {
    this.appService.getTabData().subscribe(data => {
      console.log(data);
      this.data = data['data'];
      this.dataCount = data['dataCount'];
    },
      error => {
        console.log('error in tab data', error);
      });
  }
  goToFirst() {
    this.p = 1;
  }
  goToLast() {
    const rem = Math.floor(this.dataCount % this.itemperpage);
    this.p = Math.floor(this.dataCount / this.itemperpage);
    if (rem) {
      this.p++;
    }
  }
//   config: any;
//   collection = { count: 20, data: [] };
//   constructor() {
//  this.getdata(10);
//     this.config = {
//       itemsPerPage: 10,
//       currentPage: 1,
//       totalItems: 100
//     };
//   }

//   pageChanged(event){
//     this.config.currentPage = event;
//   }

//   change(){
//     this.config.itemsPerPage = 5;
//     this.getdata(5);
//   }

//   change1(){
//     this.config.itemsPerPage = 10;
//     this.getdata(10);
//   }

//   getdata(num){
//     this.collection.data = [];
//       for (var i = 0; i < num; i++) {
//       this.collection.data.push(
//         {
//           id: i + 1,
//           value: "items number " + (i + 1)
//         }
//       );
//     }
//   }
}
