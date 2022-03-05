package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.businness.ProductService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entities.Product;

@RestController
@RequestMapping("/Product")
public class ProductController {
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@PostMapping("/add")
	public Result add(Product product) {
		return this.productService.add(product);
	}

	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}
	
	@GetMapping("/findById")
	public DataResult<Product> findById(int id) {
		return this.productService.findById(id);
	}
	
	@GetMapping("/getAllProductId")
	public DataResult<List<Product>> getAllProductId(int id) {
		return this.productService.getAllProductId(id);
	}
	
	@GetMapping("/getByBrand")
	public DataResult<List<Product>> getByBrand(String brand) {
		return this.productService.getByBrand(brand);
	}
	
	@PutMapping("/update")
	public DataResult<Product> update(Product product,int id) {
		return this.productService.update(product, id);
	}
	
	@DeleteMapping("/delete")
	public Result deleteProduct(int id) {
		return this.productService.deleteProductId(id);
	}
}
