package io.github.springbootcourse.produtosapi.repository;

import io.github.springbootcourse.produtosapi.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, String> {
    
}
