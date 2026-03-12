package com.projectgabrielD.course.repositories;

import com.projectgabrielD.course.entities.OrderItem;
import com.projectgabrielD.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
