package com.projectgabrielD.course.repositories;

import com.projectgabrielD.course.entities.Category;
import com.projectgabrielD.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
