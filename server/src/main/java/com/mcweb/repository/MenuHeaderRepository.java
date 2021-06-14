package com.mcweb.repository;

import com.mcweb.model.MenuHeader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface MenuHeaderRepository extends JpaRepository<MenuHeader, Long> {
    MenuHeader findMenuHeaderByMenuName_Id(long menuNameId);
}
