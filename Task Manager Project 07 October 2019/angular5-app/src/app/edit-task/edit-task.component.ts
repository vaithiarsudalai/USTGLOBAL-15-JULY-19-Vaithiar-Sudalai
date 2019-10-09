import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  constructor(private service : TaskService, private router:Router) { }

  deleteTask(task){
    this.service.deleteData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }
  updateTask(task) {
    this.service.updateData(task).subscribe(data=>{
      console.log(data);
      this.router.navigateByUrl("/show");
    })
  }

  ngOnInit() {
    this.service.getData();
  }

}
