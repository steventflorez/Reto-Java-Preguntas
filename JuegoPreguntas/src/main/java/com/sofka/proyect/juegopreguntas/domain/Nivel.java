package com.sofka.proyect.juegopreguntas.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;
@Data
@Entity
@Table(name = "nivel")
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "niv_id", nullable = false)
    private Integer id;

    @Column(name = "nivel", nullable = false, length = 45)
    private String levelNivel;

    @JsonManagedReference
    @OneToMany(mappedBy = "nivelNiv")
    private Set<Pregunta> preguntas = new LinkedHashSet<>();



}