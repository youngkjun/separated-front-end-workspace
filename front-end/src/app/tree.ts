import { Component, Input } from '@angular/core';

@Component({
        selector: 'tree',
        template: `
            <ul>
                <div *ngFor="let item of data">
                <node [item]="item"></node>
                </div>
            </ul>
            `
})
export class Tree {
        @Input() data: any[];
}
