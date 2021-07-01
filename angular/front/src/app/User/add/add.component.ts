import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/User';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  user!: User;

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }

  newUser(){
    this.service.addUser(this.user)
    .subscribe(data =>{
      alert("Se registró con éxito");
      this.router.navigate(['list']);
    })
  }

}
