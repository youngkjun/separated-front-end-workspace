"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var Node = (function () {
    function Node() {
        this.IsExpanded = false;
    }
    Node.prototype.ngOnInit = function () {
        console.log(this.item);
    };
    Node.prototype.toggle = function () {
        this.IsExpanded = !this.IsExpanded;
        console.log(this.IsExpanded + " " + this.item.label);
    };
    return Node;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", Object)
], Node.prototype, "item", void 0);
Node = __decorate([
    core_1.Component({
        selector: 'node',
        template: "\n          <li>\n            <a class =\"iconButton\" (click)=\"toggle()\"> <i class=\"material-icons\">add</i>{{item.label}},{{IsExpanded}}</a>\n            <div *ngIf=\"IsExpanded\">\n              <ul *ngIf=\"item.subs\">\n                <div *ngFor=\"let subitem of item.subs\">\n                  <node [item]=\"subitem\"></node>\n                </div>\n              </ul>\n            </div>\n          </li>\n          "
    })
], Node);
exports.Node = Node;
//# sourceMappingURL=node.js.map