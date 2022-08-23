package com.example.springboottutorial.repositories;

import com.example.springboottutorial.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
