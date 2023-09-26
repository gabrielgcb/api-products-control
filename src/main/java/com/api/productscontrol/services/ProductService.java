package com.api.productscontrol.services;

import com.api.productscontrol.models.ProductModel;
import com.api.productscontrol.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public Optional<ProductModel> findById(UUID id) {
        return productRepository.findById(id);
    }

    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }

    public void delete(ProductModel productModel) {
        productRepository.delete(productModel);
    }
}
