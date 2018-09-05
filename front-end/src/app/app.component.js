// import { Component } from '@angular/core';
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
// @Component({
//   selector: 'my-app',
//   template: `<h1>Hello {{name}}</h1>`,
// })
// export class AppComponent  { name = 'Angular'; }
var core_1 = require("@angular/core");
var AppComponent = (function () {
    function AppComponent() {
        this.data = [
            {
                label: 'a1',
                subs: [
                    {
                        label: 'a11',
                        subs: [
                            {
                                label: 'a111',
                                subs: [
                                    {
                                        label: 'a1111'
                                    },
                                    {
                                        label: 'a1112'
                                    }
                                ]
                            },
                            {
                                label: 'a112'
                            }
                        ]
                    },
                    {
                        label: 'a12',
                    }
                ]
            },
            {
                label: 'b1',
                subs: [
                    {
                        label: 'b11',
                    },
                    {
                        label: 'b12',
                    }
                ]
            }
        ];
    }
    return AppComponent;
}());
AppComponent = __decorate([
    core_1.Component({
        selector: 'my-app',
        template: "<tree [data]=\"data\"></tree>",
    })
], AppComponent);
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map