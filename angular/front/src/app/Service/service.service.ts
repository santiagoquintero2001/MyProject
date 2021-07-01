import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../Model/User';
import { Observable, observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  
  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/MyProject/java/back/user';

  getUser():Observable<User[]>{
    return this.http.get<User[]>(this.Url);
  }
  addUser(user:User){
    return this.http.post<User>(this.Url,user);
  }
}
