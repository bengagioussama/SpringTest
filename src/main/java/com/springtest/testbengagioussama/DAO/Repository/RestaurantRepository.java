package com.springtest.testbengagioussama.DAO.Repository;


import com.springtest.testbengagioussama.DAO.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

    @Query("select r from Restaurant r")
    List<Restaurant> findAll();
}
