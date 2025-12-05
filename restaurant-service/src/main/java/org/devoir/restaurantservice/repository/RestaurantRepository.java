package org.devoir.restaurantservice.repository;

import org.devoir.restaurantservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "restaurants")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // C'est la méthode manquante qui cause votre erreur actuelle
    List<Restaurant> findByIsOpenTrueAndIsActiveTrue();

    // Méthodes mises à jour pour correspondre aux nouveaux noms de champs de l'Entité
    // (remplace findByAvailableTrue)
    List<Restaurant> findByIsOpenTrue();

    // (remplace findByCuisine)
    List<Restaurant> findByCuisineType(String cuisineType);
}