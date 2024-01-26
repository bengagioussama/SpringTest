package com.springtest.testbengagioussama.DAO.Repository;

import com.springtest.testbengagioussama.DAO.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {

    @Query("select m from Menu m")
    List<Menu> findAll();
}
