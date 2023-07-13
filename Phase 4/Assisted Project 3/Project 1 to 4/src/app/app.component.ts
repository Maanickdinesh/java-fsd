import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'angular-app';
  pageTitle: string = 'Product List Page';
  imageWidth: number = 80;
  imageMargin: number = 10;
  showImage: boolean = false;

  toggleImage(): void {
    this.showImage = !this.showImage;
    console.log('Value of showImage inside function:', this.showImage);
  }
}
