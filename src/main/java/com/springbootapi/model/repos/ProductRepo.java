package com.springbootapi.model.repos;

import com.springbootapi.model.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository <ProductEntity, Long> {

    List<ProductEntity> findByNameContains(String name);
}
