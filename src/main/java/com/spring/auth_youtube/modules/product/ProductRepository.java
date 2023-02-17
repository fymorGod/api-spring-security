package com.spring.auth_youtube.modules.product;

import com.spring.auth_youtube.modules.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
