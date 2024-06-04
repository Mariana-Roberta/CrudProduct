package com.mariana.atividade.service;

import com.mariana.atividade.model.Product;
import com.mariana.atividade.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    public Product findById(Long id) {
        return this.productRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    public void delete(Long id) {
        this.productRepository.deleteById(id);
    }
}
