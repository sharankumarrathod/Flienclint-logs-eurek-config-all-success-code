package com.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.dto.ProducDataPojo;
import com.products.model.ProductEntity;
import com.products.repository.RepositoryService;

@Service
public class ProductService {
	
	@Autowired
	RepositoryService repositoryservice;
	
	public ProductEntity itemStore(ProducDataPojo producdatapojo) {
		
		ProductEntity entity = new ProductEntity();
		
		entity.setProductName(producdatapojo.getProductName());
		entity.setPrice(producdatapojo.getPrice());
		
	
		
		
		return 	repositoryservice.save(entity);
		
		
	}
	
	public ProductEntity getProductById(int  id) {
        return repositoryservice.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
	

}
