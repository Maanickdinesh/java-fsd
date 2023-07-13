import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directive',
  templateUrl: './directive.component.html',
  styleUrls: ['./directive.component.css'],
})
export class DirectiveComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}
  products = [
    { name: 'John Wick', email: 'Jwick@gmail.com' },
    { name: 'Bruce Wayne', email: 'BC@gmail.com' },
    { name: 'Sam Whinchester', email: 'sw@gmail.com' },
    { name: 'Dean Whinchester', email: 'Deanw@gmail.com' },
    { name: 'Castiel', email: 'cass@gmail.com' },
    { name: 'Sahoo', email: 'sahoo@gmail.com' },
    { name: 'ram', email: 'ram@gmail.com' },
  ];

  //used for if
  flag = false;

  show() {
    this.flag = !this.flag;
  }

  //used for switch case
  public day = new Date().getDay();
}
