package com.springtest.testbengagioussama.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Client")
public class Client {
    @Id
    @Column(name = "idClient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String identifiant;
    private Date datePremoierVisite;

    @ManyToMany( cascade = CascadeType.ALL)
    private Set<Menu> menu;
}
