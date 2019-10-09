import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elementRef : ElementRef) {
    elementRef.nativeElement.style.background='blue';
    elementRef.nativeElement.style.color='white';
   }

   @HostBinding('style.background') background:string;

   @HostListener('mouseenter')
   mouseEnter(){
     this.background='skyblue'}
  //   this.elementRef.nativeElement.style.background='yellow';
  //   this.elementRef.nativeElement.style.color='white';
  //  }
   @HostListener('mouseleave')
   mouseLeave(){
     this.background='purple'
    // this.elementRef.nativeElement.style.background='pink';
    // this.elementRef.nativeElement.style.color='white';
   }
}

