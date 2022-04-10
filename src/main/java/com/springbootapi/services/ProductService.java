package com.springbootapi.services;

import com.springbootapi.model.entities.ProductEntity;
import com.springbootapi.model.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public ProductEntity save(ProductEntity productEntity) {
        return productRepo.save(productEntity);
    }

    public ProductEntity findOne(Long id) {
        Optional<ProductEntity> productEntity = productRepo.findById(id);
        return productEntity.orElse(null);
    }

    public Iterable<ProductEntity> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<ProductEntity> findByNames(String name) {
        return productRepo.findByNameContains(name);
    }
}
