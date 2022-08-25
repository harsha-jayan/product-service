package com.example.productservice.com.uae.app.controller;

import com.example.productservice.com.uae.app.dto.ProductDto;
import com.example.productservice.com.uae.app.model.Product;
import com.example.productservice.com.uae.app.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.Instant;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

//    @Autowired
//    public ProductController(ProductRepository repository) {
//        this.repository = repository;
//    }

    @GetMapping
    public String myName(){
        return "harsha";
    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody Product product){
        ProductDto dto = new ProductDto();
        Product product1 = new Product(product.getId(), product.getName(), product.getCategory(), Date.from(Instant.now()));
        repository.save(product1);
        return new ResponseEntity(dto, HttpStatus.CREATED);
    }
}
