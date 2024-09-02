import { Component } from '@angular/core';
import { CartService } from '../../services/cart.service';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
  standalone: true,
  imports: [CommonModule, RouterModule]
})
export class HeaderComponent {
  showCartPopup = false;

  constructor(public cartService: CartService) {}

  toggleCartPopup() {
    this.showCartPopup = !this.showCartPopup;
  }

  get totalItems() {
    return this.cartService.getItems().length;
  }

  get totalPrice() {
    return this.cartService.getTotalPrice();
  }
}
