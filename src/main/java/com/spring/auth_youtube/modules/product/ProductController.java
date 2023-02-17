package com.spring.auth_youtube.modules.product;

import java.util.List;

import com.spring.auth_youtube.modules.product.entities.Product;
import com.spring.auth_youtube.modules.product.services.ListProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ListProductService listProductService;

  @PreAuthorize("hasRole('ADMIN')")
  @GetMapping
  public List<Product> list() {
    return listProductService.listAll();
  }

}
