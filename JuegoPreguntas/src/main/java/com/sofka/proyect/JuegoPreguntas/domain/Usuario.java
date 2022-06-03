package com.sofka.proyect.JuegoPreguntas.domain;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id", nullable = false)
    private Integer id;

    @Column(name = "usu_nombre", nullable = false, length = 45)
    private String usuNombre;

    @OneToMany(mappedBy = "usuarioUsu")
    private Set<Puntaje> puntajes = new LinkedHashSet<>();


}