package io.github.springbootcourse.produtosapi.repository;

import io.github.springbootcourse.produtosapi.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Products, String> {

    public abstract List<Products> findByName(String name);
}
