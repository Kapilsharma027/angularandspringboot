


import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { NetworkService } from './shared/services/network.service';
import { methodType } from './shared/constant';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  constructor(private http: HttpClient,
    private networkService: NetworkService) {
}

getTabData() {
//  return this.http.get('assets/data.json');
return this.networkService.request(methodType.get, '/authors', null);
}
}
