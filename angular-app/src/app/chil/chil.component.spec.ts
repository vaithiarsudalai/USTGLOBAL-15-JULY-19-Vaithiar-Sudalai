import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChilComponent } from './chil.component';

describe('ChilComponent', () => {
  let component: ChilComponent;
  let fixture: ComponentFixture<ChilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
