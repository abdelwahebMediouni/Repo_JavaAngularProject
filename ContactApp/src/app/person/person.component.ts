import { Component, OnInit } from '@angular/core';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  persons:any = [];

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.persons = this.getpersons();
  }

  getpersons() {
    this.persons = [];
    this.rest.getPersons().subscribe((data: {}) => {
      console.log(data);
      this.persons = data;
    });
  }

  add() {
    this.router.navigate(['/PersonAdd']);
  }

  delete(id) {
    this.rest.deletePerson(id)
      .subscribe(res => {
          this.getpersons();
        }, (err) => {
          console.log(err);
        }
      );
  }
  

}


