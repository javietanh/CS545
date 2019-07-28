package edu.mum.service.impl;

import edu.mum.domain.Product;
import edu.mum.repository.ProductRepository;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void updateProduct(Product product, long id) {
        productRepository.updateProduct(product, id);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.getProduct(id).get();
    }
}
