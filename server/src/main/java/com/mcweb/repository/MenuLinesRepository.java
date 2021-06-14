package com.mcweb.repository;

import com.mcweb.model.MenuLines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuLinesRepository extends JpaRepository<MenuLines, Long> {
    List<MenuLines> findMenuLinesByMenuHeaderId(long headerId);
}
