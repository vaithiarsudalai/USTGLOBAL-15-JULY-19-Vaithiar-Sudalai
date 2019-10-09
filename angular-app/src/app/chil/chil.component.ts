import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-chil',
  templateUrl: './chil.component.html',
  styleUrls: ['./chil.component.css']
})
export class ChilComponent implements OnInit {

  @Output() event = new EventEmitter();
  constructor() { }
  sendUrl(url) {
   this.event.emit(url); 
  }
  ngOnInit() {
  }

}
