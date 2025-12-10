package org.devoir.restaurantservice.repository;

import org.devoir.restaurantservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // Correction : Utilisation de @Query pour éviter l'erreur de parsing JPA avec "is"
    @Query("SELECT r FROM Restaurant r WHERE r.isOpen = true AND r.isActive = true")
    List<Restaurant> findByIsOpenTrueAndIsActiveTrue();

    // Alternative si vous avez besoin de chercher seulement par ouverture
    @Query("SELECT r FROM Restaurant r WHERE r.isOpen = true")
    List<Restaurant> findByIsOpenTrue();

    List<Restaurant> findByCuisineType(String cuisineType);
}