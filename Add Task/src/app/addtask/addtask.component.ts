import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';


@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private service: ServiceService) { }
  
  addData(form){
  this.service.tasks.push(form); 
    console.log(form)
  }
  ngOnInit() {
  }

}
