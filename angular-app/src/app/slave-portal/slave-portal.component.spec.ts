import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SlavePortalComponent } from './slave-portal.component';

describe('SlavePortalComponent', () => {
  let component: SlavePortalComponent;
  let fixture: ComponentFixture<SlavePortalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SlavePortalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SlavePortalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
