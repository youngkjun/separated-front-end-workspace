import { Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'node',
    template: `
          <li>
            <a class ="iconButton" (click)="toggle()"> <i class="material-icons">add</i>{{item.label}},{{IsExpanded}}</a>
            <div *ngIf="IsExpanded">
              <ul *ngIf="item.subs">
                <div *ngFor="let subitem of item.subs">
                  <node [item]="subitem"></node>
                </div>
              </ul>
            </div>
          </li>
          `
})
export class Node implements OnInit {
    @Input() item: any;
    IsExpanded: boolean = false;
    ngOnInit() {
      console.log(this.item);
    }
    toggle() {
      this.IsExpanded = !this.IsExpanded;
      console.log(this.IsExpanded + " " + this.item.label);
    }
}
