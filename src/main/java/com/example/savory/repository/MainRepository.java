package com.example.savory.repository;

import com.example.savory.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends JpaRepository<Products,String> {

    public Products findProductsById(String id);
}
