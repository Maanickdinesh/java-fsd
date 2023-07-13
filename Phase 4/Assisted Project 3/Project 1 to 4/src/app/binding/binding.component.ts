import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css'],
})
export class BindingComponent implements OnInit {
  toggleImage() {
    throw new Error('Method not implemented.');
  }
  constructor() {}

  ngOnInit(): void {}
  products = [
    { name: 'Pencil', price: '5', available: 'YES', ratings: 4.8 },
    { name: 'Pen', price: '20', available: 'YES', ratings: 5.0 },
    { name: 'Eraser', price: '5', available: 'NO', ratings: 4.2 },
    { name: 'Scale', price: '14', available: 'NO', ratings: 4.9 },
    { name: 'Books', price: '30', available: 'YES', ratings: 4.7 },
  ];

  name: string = 'Dineshkumar';
  url: string = 'http://www.google.com';

  //Style Binding
  we: number = 700;

  //Event Binding
  flag = false;
  show() {
    this.flag = !this.flag;
  }
}
