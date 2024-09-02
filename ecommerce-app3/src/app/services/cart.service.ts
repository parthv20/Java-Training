import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private items: any[] = [];

  constructor() {
    // Initialize the cart with items from localStorage if available
    const savedItems = localStorage.getItem('cartItems');
    if (savedItems) {
      this.items = JSON.parse(savedItems);
    }
  }

  addItem(item: any) {
    this.items.push(item);
    this.saveItems();
  }

  getItems() {
    return this.items;
  }

  removeItem(index: number) {
    this.items.splice(index, 1);
    this.saveItems();
  }

  clearCart() {
    this.items = [];
    this.saveItems();
  }

  getTotalPrice() {
    return this.items.reduce((total, item) => total + item.price, 0);
  }

  private saveItems() {
    localStorage.setItem('cartItems', JSON.stringify(this.items));
  }
}
