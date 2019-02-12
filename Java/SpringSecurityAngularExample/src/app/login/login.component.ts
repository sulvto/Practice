import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  credentials = {username: '', password: ''};

  constructor(private app: AppService, private http: HttpClient, private router: Router) { }

  ngOnInit() {
  }

  authenticated() {
    return this.app.authenticated;
  }

  login() {
    this.app.authenticate(this.credentials, () => {
      this.router.navigateByUrl('/');
    });

    return false;
  }
}
