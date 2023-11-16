package com.example.Restauracja.Restauracja;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT o FROM Order o")
    List<User> findAll();
}
