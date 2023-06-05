package com.example.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.ecommerce.models.Product;

public interface ProductDao extends CrudRepository<Product, Long> {

}
