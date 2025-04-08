package fit.iuh.productservice.controllers;

import fit.iuh.productservice.entity.Product;
import fit.iuh.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

   @GetMapping
    //list string
    public List<String> getAllProducts() {
        return  List.of("Product 1", "Product 2", "Product 3");
    }
}
