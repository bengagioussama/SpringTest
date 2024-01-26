package com.springtest.testbengagioussama.DAO.Repository;


import com.springtest.testbengagioussama.DAO.Entities.Composant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComposantRepository extends JpaRepository<Composant,Long> {


    @Query("select c from Composant c")
    List<Composant> findAll();
}
