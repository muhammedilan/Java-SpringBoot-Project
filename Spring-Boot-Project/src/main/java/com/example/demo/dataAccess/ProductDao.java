package com.example.demo.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product findById(int id);
	List<Product> findByProductId(int id);
	List<Product> getByProductBrandContains(String Brand);
}
