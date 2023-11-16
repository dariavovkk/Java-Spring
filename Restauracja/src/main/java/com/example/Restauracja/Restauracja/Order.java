package com.example.Restauracja.Restauracja;

import jakarta.persistence.*;

@Entity
@Table(name="restaurant_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dish;
    private int quantity;

    // Konstruktor domyślny (bezargumentowy) - wymagany przez JPA
    public Order() {
    }

    // Konstruktor z argumentami
    public Order(String dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    // Getter i Setter dla id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter i Setter dla dania
    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    // Getter i Setter dla ilości
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
