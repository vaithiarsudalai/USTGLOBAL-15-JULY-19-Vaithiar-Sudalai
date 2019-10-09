import { Component, OnInit,OnDestroy } from '@angular/core';
import { UserService } from '../user.service';
// import { Subscription, interval } from 'rxjs';


@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit,OnDestroy {
// mySubscription : Subscription;
  constructor(private userservice:UserService) { }

  ngOnInit() {



  // this.mySubscription=interval(1000).subscribe((data)=>{
  //   console.log(data);
  // },err=>{
  //   console.log('subscription complete')
  // });
  }
  ngOnDestroy(){
    // this.mySubscription.unsubscribe();
  }
}
