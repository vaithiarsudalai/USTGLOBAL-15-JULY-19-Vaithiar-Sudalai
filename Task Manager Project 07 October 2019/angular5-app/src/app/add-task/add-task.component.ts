import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private service : TaskService, private router : Router) { }

  addDetails(taskForm : NgForm) {
    this.service.sendData(taskForm.value).subscribe(data =>{
      console.log(data);
      taskForm.reset();
      this.router.navigateByUrl("/show");
    })
  }

  ngOnInit() {
  }

}
