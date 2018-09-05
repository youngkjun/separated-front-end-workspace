// import { Component } from '@angular/core';

// @Component({
//   selector: 'my-app',
//   template: `<h1>Hello {{name}}</h1>`,
// })
// export class AppComponent  { name = 'Angular'; }

import { Component } from '@angular/core';


@Component({
  selector: 'my-app',
  template: `<tree [data]="data"></tree>`,
})
export class AppComponent  {
  data = [
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
