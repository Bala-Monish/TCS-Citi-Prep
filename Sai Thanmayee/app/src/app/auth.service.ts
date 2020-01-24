import { Injectable } from '@angular/core';
import {User} from './user';
import { Product } from './entities/product';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private products: Product[];
  constructor() {
    this.products = [
      { id: '1', name: 'Cherry', price: 30, photo: '/assets/images/image1.jpg' },
      { id: '2', name: 'Apple', price: 25, photo: '/assets/images/image2.jpg' },
      { id: '3', name: 'Watermelon', price: 30, photo: '/assets/images/image3.jpg' },
      { id: '4', name: 'Papaya', price: 45, photo: '/assets/images/image4.jpg' },
      { id: '5', name: 'Strawberry', price: 15, photo: '/assets/images/image5.jpg' },
      { id: '6', name: 'Mango', price: 50, photo: '/assets/images/image6.jpg' },
      { id: '7', name: 'Pineapple', price: 60, photo: '/assets/images/image7.jpg' },
      { id: '8', name: 'Banana', price: 20, photo: '/assets/images/image8.jpg' },
      { id: '9', name: 'Orange', price: 35, photo: '/assets/images/image9.jpg' },
      { id: '10', name: 'Grapes', price: 30, photo: '/assets/images/image10.jpg' }
  ];
   }

  public login(userInfo: User){
    localStorage.setItem('key', "value1");
  }

   public isLoggedIn(){
     return localStorage.getItem('key') !== null;

   }

  findAll(): Product[] {
    return this.products;
}

find(id: string): Product {
    return this.products[this.getSelectedIndex(id)];
}

private getSelectedIndex(id: string) {
    for (var i = 0; i < this.products.length; i++) {
        if (this.products[i].id == id) {
            return i;
        }
    }
    return -1;
}
   public logout(){
     localStorage.removeItem('key');
   }
}
