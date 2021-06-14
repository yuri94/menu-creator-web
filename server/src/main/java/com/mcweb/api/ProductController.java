package com.mcweb.api;

import com.mcweb.model.Category;
import com.mcweb.model.MenuHeader;
import com.mcweb.model.Product;
import com.mcweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<?> all() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody Product product) {
        productRepository.save(product);
        return ResponseEntity.ok("Done");
    }


}
