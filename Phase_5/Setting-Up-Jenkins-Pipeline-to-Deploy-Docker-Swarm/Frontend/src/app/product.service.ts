import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }

  loadAllProduct():Observable<Product[]>{
    return this.http.get<Product[]>("http://3.84.8.94:8484/product/allProduct");
  }
}
