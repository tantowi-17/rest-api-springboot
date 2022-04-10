package com.springbootapi.controllers;

import com.springbootapi.model.entities.ProductEntity;
import com.springbootapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductEntity create(@RequestBody ProductEntity productEntity) {
        return productService.save(productEntity);
    }

    @GetMapping
    public Iterable<ProductEntity> findAll() {
        Iterable<ProductEntity> iterable = productService.findAll();
        return iterable;
    }

    @GetMapping("/{id}")
    public ProductEntity findOne(@PathVariable("id") Long id) {
        return productService.findOne(id);
    }

    @PutMapping
    public ProductEntity update(@RequestBody ProductEntity productEntity) {
        return productService.save(productEntity);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        productService.removeOne(id);
    }

}
