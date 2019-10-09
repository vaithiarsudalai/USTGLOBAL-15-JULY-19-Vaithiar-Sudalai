import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users=[{
    name:'Vignesh',
    company:'Ust Global'
  },
{
  name:'Pranali',
  company:'Ust Global'
},
{
  name:'Pranali',
  company:'Ust Global'
}]
  constructor() { }
  printForm(){
    console.log('The function in the service is workng');
  }
}
