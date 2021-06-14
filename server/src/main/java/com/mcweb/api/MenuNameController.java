package com.mcweb.api;

import com.mcweb.model.MenuHeader;
import com.mcweb.model.MenuName;
import com.mcweb.repository.MenuHeaderRepository;
import com.mcweb.repository.MenuNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/menu_name")

public class MenuNameController {

    @Autowired
    private MenuNameRepository menuNameRepository;

    @GetMapping(value = "/all")
    public ResponseEntity<?> all() {
        List<MenuName> menuNames = menuNameRepository.findAll();
        return ResponseEntity.ok(menuNames);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody MenuName menuName) {
        menuNameRepository.save(menuName);
        return ResponseEntity.ok("Done");
    }

}
