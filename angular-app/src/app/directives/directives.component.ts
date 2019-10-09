import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
condition =false;
  users=[
    {
      id:1234,
      name:'Vignesh',
      place: 'Mumbai'
    },{
      id:1256,
      name:'Saurabh',
      place: 'Patna'
    },
    {
      id:1278,
      name:'Aniket',
      place: 'Lucknow'
    },
    {
      id:1277,
      name:'Varun',
      place: 'Mumbai'
    },
    {
      id:1260,
      name:'Vishal',
      place: 'Hydrabad'
    }
  ];
  constructor() { }
removeData(i){
  let index=this.users.indexOf(i);
  this.users.splice(index,1)
this.condition=true;

}
refreshOver(){
  this.condition=false;
}

  ngOnInit() {
  }

}
