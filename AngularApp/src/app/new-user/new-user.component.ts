import { Component, OnInit } from '@angular/core';
import { Register } from '../register';

import { UserService } from '../user.service';
@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {

  constructor(private userService:UserService) { }
  user : Register = new Register();
  message:any="";
  ngOnInit(): void {
  }


  public RegisterUser(){
    this.userService.DoUserRegistration(this.user).subscribe(data=>this.message =data);
  }
}
