import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
moviesArray:any[]=[];
  constructor(private http : HttpClient) {}
    searchMovies(movie)
    {
console.log(movie);
    
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie}&apikey=f0932a1f`).subscribe(resData =>{
      this.moviesArray=resData.Search;
      console.log(this.moviesArray);
      
    })
    
  }
  

  ngOnInit() {
  }

}
