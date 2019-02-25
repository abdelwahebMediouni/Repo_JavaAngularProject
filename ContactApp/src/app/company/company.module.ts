import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CompanyListComponent } from './company-list/company-list.component';
import { CompanyAddComponent } from './company-add/company-add.component';
import { CompanyDetailComponent } from './company-detail/company-detail.component';
import { CompanyEditComponent } from './company-edit/company-edit.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [CompanyListComponent, CompanyAddComponent, CompanyDetailComponent, CompanyEditComponent]
})
export class CompanyModule { }
