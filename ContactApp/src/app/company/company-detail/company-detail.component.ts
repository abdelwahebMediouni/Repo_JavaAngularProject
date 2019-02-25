import { Component, OnInit } from '@angular/core';
import { RestService } from '../../rest.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-company-detail',
  templateUrl: './company-detail.component.html',
  styleUrls: ['./company-detail.component.css']
})
export class CompanyDetailComponent implements OnInit {

  company:any;

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }
  ngOnInit() {
    this.rest.getCompany(this.route.snapshot.params['id']).subscribe((data: {}) => {
      console.log(data);
      this.company = data;
    });
  }
}
