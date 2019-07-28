package edu.mum.repository;

import edu.mum.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<Product> getProduct(long id);

    void updateProduct(Product product, long id);

    void addProduct(Product product);

    void deleteProduct(long id);

}

