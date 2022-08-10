package com.service;

import java.io.PrintWriter;

import com.bean.Product;
import com.dao.ProductDAO;


public class ProductService {
ProductDAO pd = new ProductDAO();
Product p = new Product();	

	public String addProduct(Product product) {
		if(pd.addProduct(product) > 0) {
			
			return "Product added successfully";
			
		}
		else {
			return "Product didn't add, Id must be unique";
		}
	}	

}
