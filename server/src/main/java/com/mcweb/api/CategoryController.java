package com.mcweb.api;

import com.mcweb.model.Category;
import com.mcweb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<?> all() {
        List<Category> categories = categoryRepository.findAll();
        return ResponseEntity.ok(categories);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody Category category) {
        categoryRepository.save(category);
        return ResponseEntity.ok("Done");
    }
}
