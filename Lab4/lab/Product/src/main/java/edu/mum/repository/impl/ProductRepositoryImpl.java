package edu.mum.repository.impl;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.repository.CategoryRepository;
import edu.mum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    CategoryRepository categoryRepository;

    private List<Product> listOfProducts;

    @Autowired
    public ProductRepositoryImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
        listOfProducts = new ArrayList<>();
        Category category = categoryRepository.getCategory(1);
        Category sport = categoryRepository.getCategory(1);
        Product bowTie = new Product(1, "Bow Tie", "Loud", (float) 22.0, category);
        Product tShirt = new Product(2, "T-Shirt", "White T-Shirt", (float) 25.0, sport);
        listOfProducts.add(bowTie);
        listOfProducts.add(tShirt);
    }

    public List<Product> getAll() {
        return listOfProducts;
    }

    public Optional<Product> getProduct(long id) {
        return listOfProducts
                .stream()
                .filter(x -> x.getId() == id)
                .findFirst();
    }

    public void updateProduct(Product product, long id) {
        listOfProducts.forEach(x -> {
            if (x.getId() == id) {
                x.setName(product.getName());
                x.setDescription(product.getDescription());
                x.setPrice(product.getPrice());
                x.setCategory(product.getCategory());
            }
        });
    }

    public void addProduct(Product product) {
        // get new product id.
        int newId = getAll().size() + 1;
        product.setId(newId);
        listOfProducts.add(product);
    }

    @Override
    public void deleteProduct(long id) {
        Product product = getProduct(id).get();
        listOfProducts.remove(product);
    }
}
