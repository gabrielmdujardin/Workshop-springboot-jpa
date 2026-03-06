package com.projectgabrielD.course.repositories;

import com.projectgabrielD.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
