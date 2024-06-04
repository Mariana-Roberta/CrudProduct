package com.mariana.atividade.controller;

import com.mariana.atividade.model.Product;
import com.mariana.atividade.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {
        return this.productService.save(product);
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable("id") Long id) {
        return this.productService.findById(id);
    }

    @PutMapping("/products/{id}")
    public Product update(@RequestBody Product product) {
        return this.productService.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.productService.delete(id);
    }
}
