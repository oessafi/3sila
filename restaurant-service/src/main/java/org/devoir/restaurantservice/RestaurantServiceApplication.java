package org.devoir.restaurantservice;

import org.modelmapper.ModelMapper; // N'oubliez pas cet import !
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean; // Import pour @Bean

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class RestaurantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }

    // C'est cette partie qui manquait dans votre code :
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}