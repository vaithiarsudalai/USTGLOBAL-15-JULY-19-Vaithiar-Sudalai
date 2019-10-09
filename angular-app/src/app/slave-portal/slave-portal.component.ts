import { Component, OnInit, Output, EventEmitter, Input } from '@angular/core';

@Component({
  selector: 'app-slave-portal',
  templateUrl: './slave-portal.component.html',
  styleUrls: ['./slave-portal.component.css']
})
export class SlavePortalComponent implements OnInit {

  @Output() slaveData = new EventEmitter();
  @Input () dataFromMaster='';
  constructor() { }

  ngOnInit() {
    this.slaveData.emit('Data from Slave');
  }

}
