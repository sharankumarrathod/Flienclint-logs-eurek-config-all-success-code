package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.ProductEntity;

@Repository

public interface RepositoryService extends JpaRepository<ProductEntity, Integer> {
	
	

}
