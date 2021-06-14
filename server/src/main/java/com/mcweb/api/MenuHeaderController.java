package com.mcweb.api;

import com.mcweb.model.Category;
import com.mcweb.model.MenuHeader;
import com.mcweb.model.Product;
import com.mcweb.repository.MenuHeaderRepository;
import com.mcweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menu_header")
public class MenuHeaderController {

    @Autowired
    private MenuHeaderRepository menuHeaderRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<?> all() {
        List<MenuHeader> menuHeaders = menuHeaderRepository.findAll();
        return ResponseEntity.ok(menuHeaders);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody MenuHeader menuHeader) {
        menuHeaderRepository.save(menuHeader);
        return ResponseEntity.ok("Done");
    }
}
