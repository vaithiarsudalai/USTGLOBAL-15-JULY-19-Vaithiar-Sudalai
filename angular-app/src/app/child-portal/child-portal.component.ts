import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';

@Component({
  selector: 'app-child-portal',
  templateUrl: './child-portal.component.html',
  styleUrls: ['./child-portal.component.css']
})
export class ChildPortalComponent implements OnInit {

  @Output() childData= new EventEmitter();
  @Input() dataFromParent='';

  constructor() { }

  ngOnInit() {
  
this.childData.emit('this is data from child');
}

}
