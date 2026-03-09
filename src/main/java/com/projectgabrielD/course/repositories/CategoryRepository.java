package com.projectgabrielD.course.repositories;

import com.projectgabrielD.course.entities.Category;
import com.projectgabrielD.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
