import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-portal',
  templateUrl: './parent-portal.component.html',
  styleUrls: ['./parent-portal.component.css']
})
export class ParentPortalComponent implements OnInit {
pData='parent Data Here';
  constructor() { }

  ngOnInit() {
  }

}
