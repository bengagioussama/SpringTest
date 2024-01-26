package com.springtest.testbengagioussama.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Restaurant")
public class Restaurant {
    @Id
    @Column(name = "idRestaurant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idRestaurant;
    private String nom;
    private long nbPlacesMax;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> reservations;


}
