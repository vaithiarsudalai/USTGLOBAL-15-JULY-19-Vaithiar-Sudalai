import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';    // imported FormsModule from @angular/forms
import { RouterModule } from '@angular/router';  // imported RouterModule from @angular/router

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './users/users.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    RegisterComponent,
    UsersComponent,
    PageNotFoundComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,                                                  // imported FormsModule
    RouterModule.forRoot([                                       //  imported RouterModule
      {path : '' , component : HomeComponent},                  // Giving paths to the components
      {path : 'about' , component : AboutComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'users' , component : UsersComponent},
      {path : '**' , component : PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
