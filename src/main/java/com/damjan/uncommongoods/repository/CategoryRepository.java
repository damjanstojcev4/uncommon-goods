package com.damjan.uncommongoods.repository;

import com.damjan.uncommongoods.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findByCategory(String category);
}
