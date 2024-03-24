package com.example.crud.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class Product    {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private Number price_in_cents;

    public Product(String id, String name, Number price_in_cents) {
        this.id = id;
        this.name = name;
        this.price_in_cents = price_in_cents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getPrice_in_cents() {
        return price_in_cents;
    }

    public void setPrice_in_cents(Number price_in_cents) {
        this.price_in_cents = price_in_cents;
    }
}
