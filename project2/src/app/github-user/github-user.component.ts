import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-github-user',
  templateUrl: './github-user.component.html',
  styleUrls: ['./github-user.component.css']
})
export class GithubUserComponent implements OnInit {

  // Dependency Injection is performed
  constructor(private service: UserService) { }

  User: any[] = [];                      // Empty Array is being initalized to get data from service

  // When the page is initialized Http Get Method is executed
  ngOnInit() {
    this.service.getData().subscribe(resData => {    // Observables is used (subscribe)
      this.User = resData;
      console.log(this.User);
    }, err => {                                     // Error message
      console.log(err);
    });
  }
  // Http Delete Method Logic
  deleteData(u) {                                      // Function is called from View
  this.service.deleteData(u).subscribe(data => {      // Observables is used (subscribe)
    console.log(data);
  }, err => {
    console.log(err);                                 // Error message
  });
  }

}
