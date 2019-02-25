import { Component, OnInit, Input } from '@angular/core';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-person-add',
  templateUrl: './person-add.component.html',
  styleUrls: ['./person-add.component.css']
})
export class PersonAddComponent implements OnInit {
  @Input() personData = { name:'', address :{street:'',city:'',state:'',zip:''}};

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }
  addPerson() {
    this.rest.addPersons(this.personData).subscribe((result) => {
      this.router.navigate(['/PersonDetail/'+result.id]);
    }, (err) => {
      console.log(err);
    });
    
 }

}

