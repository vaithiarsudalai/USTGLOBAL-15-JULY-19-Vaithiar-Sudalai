import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  users=[];
  printForm(loginForm :NgForm,username){
    console.log(loginForm);
    this.users.push(loginForm.value);
    loginForm.reset();
     console.log(username);
  }


  constructor() { }

  ngOnInit() {
  }

}
