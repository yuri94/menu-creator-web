package com.mcweb.repository;

import com.mcweb.model.MenuName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuNameRepository extends JpaRepository<MenuName, Long> {

    MenuName findFirstByName(String name);

}
