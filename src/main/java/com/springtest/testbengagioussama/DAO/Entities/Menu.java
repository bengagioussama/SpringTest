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
@Table(name="Menu")
public class Menu {
    @Id
    @Column(name = "idMenu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;
    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private float prixTotal;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Composant> composants;


    @ManyToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private Set<Client> clients;
}
