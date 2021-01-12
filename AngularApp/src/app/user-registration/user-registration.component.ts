import { Component, OnInit } from '@angular/core';

import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent implements OnInit {
  user : User = new User("","","","","","",0,"");
  
  constructor(private userService:UserService) { }

  message:any ="";

  ngOnInit(): void {
  }

  public RegisterUser(){
    this.userService.DoUserRegistration(this.user).subscribe(data=>this.message =data);
  }
}
