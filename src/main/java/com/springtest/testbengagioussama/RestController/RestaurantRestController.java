package com.springtest.testbengagioussama.RestController;

import com.springtest.testbengagioussama.DAO.Entities.Client;
import com.springtest.testbengagioussama.DAO.Entities.Composant;
import com.springtest.testbengagioussama.DAO.Entities.Restaurant;
import com.springtest.testbengagioussama.DAO.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RestaurantRestController {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ComposantRepository composantRepository;

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    RestaurantRepository restaurantRepository;


    @GetMapping("/getAllClients")
    public List<Client> getAllClients() {return clientRepository.findAll();}

    @GetMapping("/getAllComposants")
    public List<Composant> getAllComposants() {
        return composantRepository.findAll();
    }

    @PostMapping("/ajouterRestaurant")
    Restaurant newRestaurant(@RequestBody Restaurant rest) {
        return restaurantRepository.save(rest);
    }

    @PostMapping("/ajouterClient")
    Client newClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }





    @GetMapping("/getAllRestaurants")
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @PostMapping("/addClient")
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }




}
