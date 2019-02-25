import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { PersonComponent } from './person/person.component';
import {FormsModule} from '@angular/forms';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { PersonAddComponent } from './person-add/person-add.component';
import { PersonDetailComponent } from './person-detail/person-detail.component';
import { PersonEditComponent } from './person-edit/person-edit.component';


const appRoutes:Routes =[

{path:'PersonDetail/:id', component:PersonDetailComponent, data: { title: 'Person details' }},
{path:'person', component:PersonComponent, data: { title: 'Person List' }},
{path:'PersonAdd', component:PersonAddComponent, data: { title: 'Person add' }},
{path:'Personedit/:id', component:PersonEditComponent, data: { title: 'Person edit' }},
{path:'', redirectTo: '/person',pathMatch: 'full'}

];
@NgModule({
  declarations: [
    AppComponent,
    PersonComponent,
    PersonAddComponent,
    PersonDetailComponent,
    PersonEditComponent
  ],
  imports: [
    BrowserModule, HttpClientModule ,FormsModule, RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
