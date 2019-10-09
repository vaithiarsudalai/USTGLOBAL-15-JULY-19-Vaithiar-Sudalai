import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildPortalComponent } from './child-portal.component';

describe('ChildPortalComponent', () => {
  let component: ChildPortalComponent;
  let fixture: ComponentFixture<ChildPortalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildPortalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildPortalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
