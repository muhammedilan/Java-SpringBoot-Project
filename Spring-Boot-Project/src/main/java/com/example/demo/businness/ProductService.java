package com.example.demo.businness;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.ProductDao;
import com.example.demo.entities.Product;

@Service
public class ProductService {

	private ProductDao productDao;
	
	
	public ProductService(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product Added");
	}
	
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"All Products have arrived");
	}
	
	public DataResult<Product> findById(int id) {
	 	return new SuccessDataResult<Product>(this.productDao.findById(id), "Product arrived by id");
	 }
	
	public DataResult<List<Product>> getAllProductId(int id) {
		return new SuccessDataResult<List<Product>>(this.productDao.findByProductId(id), "Products arrived by id");
	}
	
	public DataResult<List<Product>> getByBrand(String brand) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductBrandContains(brand),"Products arrived by brand");
	}
	
	public DataResult<Product> update(Product product,int id) {
	return new SuccessDataResult<Product>
		(this.productDao.save(product), "Product Updated");
	}
	
	public Result deleteProductId(int id) {
		this.productDao.deleteById(id);
		return new SuccessResult("Product Deleted");
	}
	
}
