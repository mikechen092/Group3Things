import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { UserComponent } from './components/user/user.component';
import { RecipesubmissionComponent } from './components/recipesubmission/recipesubmission.component';
import { CandylistComponent } from './components/candylist/candylist.component';
import { LoginComponent } from './components/login/login.component';
import {AppRoutingModule, routingComponents} from './app-routing.module';


@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    RecipesubmissionComponent,
    CandylistComponent,
    LoginComponent,
    routingComponents
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
