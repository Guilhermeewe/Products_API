package io.github.springbootcourse.produtosapi.controller;


import io.github.springbootcourse.produtosapi.model.Products;
import io.github.springbootcourse.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @PostMapping
    public void insertProduct(@RequestBody Products product) {

        var id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);

        System.out.println("Product insert " + product);
    }

    @GetMapping
    public List<Products> searchProductByQueryParams(@RequestParam("name") String name ) {
        return productRepository.findByName(name);
    }

    @GetMapping("/all")
    public List<Products> findAllProducts() {
        return productRepository.findAll();

    }

    @GetMapping("/{id}")
    public Products findProductById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateProductById(@RequestBody Products product,
                                  @PathVariable("id") String id)
    {
        product.setId(id);
        productRepository.save(product);

    }

}
