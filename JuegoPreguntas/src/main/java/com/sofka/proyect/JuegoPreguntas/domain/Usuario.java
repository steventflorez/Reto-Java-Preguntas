package com.sofka.proyect.JuegoPreguntas.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;
@Data
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