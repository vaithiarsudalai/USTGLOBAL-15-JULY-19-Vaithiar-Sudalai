import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  constructor() { }
carData: any='';

cars=[
  { brand:'BMW',
  img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
  description:'BMW is a German multinational company which produces automobiles and motorcycles. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 until 1918 and again from 1933 to 1945.'
},
{
  brand:'Mercedes',
  img:'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
  description:'Mercedes-Benz is a German global automobile marque and a division of Daimler AG. The brand is known for luxury vehicles, buses, coaches, and trucks. The headquarters is in Stuttgart, Baden-Württemberg. The name first appeared in 1926 under Daimler-Benz. '
},
{ brand:'Porsche',
  img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
  description:'Dr.-Ing. h.c. F. Porsche AG, usually shortened to Porsche AG, is a German automobile manufacturer specializing in high-performance sports cars, SUVs and sedans. Porsche AG is headquartered in Stuttgart, and is owned by Volkswagen AG, which is itself majority-owned by Porsche Automobil Holding SE.'},
{
brand:'Audi',
img:'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
description:'Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide. '
},
{
  brand:'Jaguar',
  img:'https://cdn.pixabay.com/photo/2016/04/09/08/45/sports-car-1317645__340.jpg',
  description:'Jaguar is the luxury vehicle brand of Jaguar Land Rover, a British multinational car manufacturer with its headquarters in Whitley, Coventry, England.'
  },
  {
    brand:'Ferrari',
    img:'https://cdn.pixabay.com/photo/2012/02/27/17/08/sportscar-17583__340.jpg',
    description:'Ferrari is an Italian luxury sports car manufacturer based in Maranello. Founded by Enzo Ferrari in 1939 out of Alfa Romeos race division as Auto Avio Costruzioni, the company built its first car in 1940.'
    }
]

sendCar(car){
this.carData=car;
}
  ngOnInit() {
  }

}
