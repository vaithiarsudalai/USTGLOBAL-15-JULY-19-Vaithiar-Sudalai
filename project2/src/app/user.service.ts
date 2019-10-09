import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';   // Importing HttpClient from @angular/common/http
import { map } from 'rxjs/operators';                // Importing HttpClient from rxjs/operators

@Injectable({
  providedIn: 'root'
})
export class UserService {

  // HttpClient is imported from @angular/common/http used the http to use it
  constructor(private http: HttpClient) { }

  // API Url from we need to fetch the data
  url = 'https://api.github.com/users';

  // Http Get Method to show the fetched data
  getData() {
    return this.http.get<any>(this.url).pipe(map (data => {   // pipe is used to filter the data
       let newArray: any[] = [];                              // map is the looping it is present in rxjs/operators
      for (let index in data) {
          newArray.push(data[index]);
      }return newArray;                            // returns Array where getData is called
    }, err => {
      console.log(err);                            // Error Message
    }));
  }

  // Http delete Method to delete data
  deleteData(id) {
    return this.http.delete(`${this.url}/${id}`);
  }
}
