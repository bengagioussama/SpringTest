package com.springtest.testbengagioussama.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Composant")
public class Composant {
    @Id
    @Column(name = "idComposant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;
    private String nomComposant;
    private float prix;

    @ManyToOne
    Menu menu;

}
