package com.projectgabrielD.course.repositories;

import com.projectgabrielD.course.entities.Order;
import com.projectgabrielD.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
