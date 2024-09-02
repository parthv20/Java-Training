import { Route } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ProductGridComponent } from './components/product-grid/product-grid.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';

export const routes: Route[] = [
  { path: 'login', component: LoginComponent },
  { path: 'products', component: ProductGridComponent },
  { path: 'products/:id', component: ProductDetailsComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' }
];
