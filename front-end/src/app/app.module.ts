import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import { Tree }  from './tree';
import { Node }  from './node';

@NgModule({
  imports:      [ BrowserModule ],
  declarations: [ AppComponent, Tree, Node ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
