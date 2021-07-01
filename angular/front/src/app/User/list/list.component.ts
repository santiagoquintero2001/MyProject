import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/User';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  users!: User[];

  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit() {
    this.service.getUser().subscribe((data: User[])=>{
      this.users=data;
    })
    

  }

}
