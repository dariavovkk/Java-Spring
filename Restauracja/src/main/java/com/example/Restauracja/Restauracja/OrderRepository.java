package com.example.Restauracja.Restauracja;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    @Query("SELECT o FROM Order o")
    List<Order> findAll();
}
