import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserRegistrationComponent } from './user-registration/user-registration.component';

const routes: Routes = [
  {path:"",redirectTo:"registerUser",pathMatch:"full"},
  {path : "registerUser",component:UserRegistrationComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
