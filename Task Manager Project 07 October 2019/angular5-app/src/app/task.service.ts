import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http : HttpClient) { }

  taskInfo:any[] = [];

  sendData(data) {
    return this.http.post('http://localhost:8083/task/add',data);
  }

  getData(){
    return this.http.get<any>('http://localhost:8083/task/get-all').subscribe(resData =>{
      console.log(resData);
      this.taskInfo = resData.taskList;
      console.log(this.taskInfo);
    },err=>{
      console.log(err);
    })
  }
  
  updateData(data) {
    return this.http.put('http://localhost:8083/task/update',data);
  }

  deleteData(data) {
    return this.http.delete(`http://localhost:8083/task/remove/${data}`);
  }
}
