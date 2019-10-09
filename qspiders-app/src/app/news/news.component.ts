import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
indianNews:any[]=[];
  constructor(private http:HttpClient) { 

  http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=1a91c32b3e6242b895888bcb01c62521').
  subscribe(resData =>{
this.indianNews= resData.articles;
console.log(this.indianNews);
  })
}
  ngOnInit() {
  }

}
