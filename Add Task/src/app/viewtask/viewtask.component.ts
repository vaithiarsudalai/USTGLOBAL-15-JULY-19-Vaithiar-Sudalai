import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-viewtask',
  templateUrl: './viewtask.component.html',
  styleUrls: ['./viewtask.component.css']
})
export class ViewtaskComponent implements OnInit {
  
  view:any[]=[];
  
  constructor(private service: ServiceService) {  }

  deleteData(i){
    this.service.tasks.push(i);
  }

  addData(form,i) {
    this.service.tasks.push(i);
    this.service.tasks.push(form); 
    console.log(form)
  }
  ngOnInit() {
    
    for(var i of this.service.sendData()) {
      this.view.push(i);
      console.log(i)
    }
    
  }
}
