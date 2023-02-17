package com.spring.auth_youtube.modules.product.services;

import java.util.List;

import com.spring.auth_youtube.modules.product.ProductRepository;
import com.spring.auth_youtube.modules.product.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListProductService {

  @Autowired
  ProductRepository productRepository;

  public List<Product> listAll() {
    return productRepository.findAll();
  }
}
