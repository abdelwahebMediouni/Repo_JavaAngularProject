import { Component, OnInit } from '@angular/core';
import { RestService } from '../../rest.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.css']
})
export class CompanyListComponent implements OnInit {
  companies:any = [];

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }



  ngOnInit() {
    this.companies = this.getcompanies();
  }
  getcompanies() {
    this.companies = [];
    this.rest.getCompanies().subscribe((data: {}) => {
      console.log(data);
      this.companies = data;
    });
  }

  add() {
    this.router.navigate(['/CompanyAdd']);
  }

  delete(id) {
    this.rest.deleteCompany(id)
      .subscribe(res => {
          this.getcompanies();
        }, (err) => {
          console.log(err);
        }
      );
  }
  

}
