import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MasterPortalComponent } from './master-portal.component';

describe('MasterPortalComponent', () => {
  let component: MasterPortalComponent;
  let fixture: ComponentFixture<MasterPortalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MasterPortalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MasterPortalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
