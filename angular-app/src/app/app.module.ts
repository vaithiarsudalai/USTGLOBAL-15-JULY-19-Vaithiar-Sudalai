import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';



import { AppComponent } from './app.component';
import { SampleComponent } from './sample.component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { FaceComponent } from './face/face.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { DirectivesComponent } from './directives/directives.component';
import { IfSwitchComponent } from './if-switch/if-switch.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { MyDirectiveDirective } from './my-directive.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ParentPortalComponent } from './parent-portal/parent-portal.component';
import { ChildPortalComponent } from './child-portal/child-portal.component';
import { MasterPortalComponent } from './master-portal/master-portal.component';
import { SlavePortalComponent } from './slave-portal/slave-portal.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { ParComponent } from './par/par.component';
import { ChilComponent } from './chil/chil.component';

@NgModule({
  declarations: [
    AppComponent,SampleComponent, HeaderComponent, DataBindingComponent, FaceComponent, TwoWayComponent, DirectivesComponent, IfSwitchComponent, AttributeDirectivesComponent, MyDirectiveDirective, ParentComponent, ChildComponent, ParentPortalComponent, ChildPortalComponent, MasterPortalComponent, SlavePortalComponent, CarsComponent, CarDetailsComponent, ParComponent, ChilComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
