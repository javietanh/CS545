package edu.mum.controller;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;
    private CategoryService categoryService;

    @Autowired
    public ProductController(ProductService productService,
                             CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @ModelAttribute("categories")
    public List<Category> getCategories() {
        return categoryService.getAll();
    }

    /* get list of product */
    @GetMapping("/")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getAll());
        return "productList";
    }

    /* get product to edit */
    @GetMapping(value = {"/edit/{id}"})
    public String getProduct(@ModelAttribute Product product, @PathVariable("id") long id) {
        Product query = productService.getProduct(id);
        product.setId(query.getId());
        product.setName(query.getName());
        product.setDescription(query.getDescription());
        product.setPrice(query.getPrice());
        product.setCategory(query.getCategory());
        return "productForm";
    }

    /* save product */
    @PostMapping(value = "/save/{id}")
    public String saveProduct(@ModelAttribute Product product, @PathVariable(value = "id", required = false) Integer id) {
        if (id != 0)
            productService.updateProduct(product, id);
        else
            productService.addProduct(product);
        return "redirect:/";
    }

    /* add product */
    @GetMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product) {
        return "productForm";
    }

    /* product detail */
    @GetMapping(value = "/detail/{id}")
    public String getProductDetail(@ModelAttribute Product product, @PathVariable(value = "id", required = true) Integer id) {
        Product query = productService.getProduct(id);
        product.setId(query.getId());
        product.setName(query.getName());
        product.setDescription(query.getDescription());
        product.setPrice(query.getPrice());
        product.setCategory(query.getCategory());
        return "productDetails";
    }

    /* product delete */
    @GetMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable(value = "id", required = true) Integer id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
