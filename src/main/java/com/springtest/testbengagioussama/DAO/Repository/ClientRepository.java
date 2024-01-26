package com.springtest.testbengagioussama.DAO.Repository;

import com.springtest.testbengagioussama.DAO.Entities.Client;
import com.springtest.testbengagioussama.DAO.Entities.Menu;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {


    @Query("select c from Client c")
    List<Client> findAll();






}
