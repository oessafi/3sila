package org.devoir.restaurantservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

@Entity
@Table(name = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phone;

    // Ajout du champ manquant 'email'
    private String email;

    // Renommé de 'cuisine' à 'cuisineType' pour correspondre au Service et DTO
    private String cuisineType;

    // Renommé de 'available' à 'isOpen' pour correspondre au Service (setIsOpen)
    private Boolean isOpen;

    // Champs manquants ajoutés
    private Double rating;
    private Boolean isActive;
    private Double deliveryFee;
    private Double minimumOrderAmount;

    private String openingHours;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<MenuItem> menuItems;
}