package edu.mum.service;

import edu.mum.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void updateProduct(Product product, long id);
    void addProduct(Product product);
    void deleteProduct(long id);
    Product getProduct(long id);
}
