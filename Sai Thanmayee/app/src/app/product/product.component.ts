import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../entities/product';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  private products: Product[];

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {

    this.products = this.authService.findAll();
  }

 

}
