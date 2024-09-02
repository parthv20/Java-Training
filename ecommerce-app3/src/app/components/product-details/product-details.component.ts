import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { CartService} from '../../services/cart.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css'],
  standalone: true,
  imports: [CommonModule]
})
export class ProductDetailsComponent implements OnInit {
  product: any = null;

  constructor(private route: ActivatedRoute, private http: HttpClient, private cartService: CartService) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id')!;
    this.http.get(`https://fakestoreapi.com/products/${id}`)
      .subscribe(data => this.product = data);
  }

  addToCart(product: any) {
    this.cartService.addItem(product);
  }
}
