package io.github.springbootcourse.produtosapi.controller;


import io.github.springbootcourse.produtosapi.model.Products;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {


    @PostMapping
    public void insertProduct(@RequestBody Products product) {
        System.out.println("Product insert " + product);
    }

}
