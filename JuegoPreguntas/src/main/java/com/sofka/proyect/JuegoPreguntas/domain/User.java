package com.sofka.proyect.JuegoPreguntas.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Long id;

    @Column(name = "usu_nombre")
    private String name;

}
