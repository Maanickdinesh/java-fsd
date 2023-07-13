import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeColorDirective } from './ChangeColorDirective';
import { DirectiveComponent } from './directive/directive.component';
import { HighLightDirective } from './HighLightDirective';

@NgModule({
  declarations: [
    AppComponent,
    DirectiveComponent,
    ChangeColorDirective,
    HighLightDirective,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
