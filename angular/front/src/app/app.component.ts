import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'front';

  constructor(private router:Router){}

  List(){
    this.router.navigate(["list"]);
  }
  New(){
    this.router.navigate(["add"]);
  }
}
