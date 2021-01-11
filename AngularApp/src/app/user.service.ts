import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { User } from './Classes/UserInfo';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http :HttpClient) { }

  public DoUserRegistration(user:User){
    return this.http.post("http://localhost:8080/AddUser",user,{responseType:'text' as 'json'});
  }
}
