package com.sofka.proyect.juegopreguntas.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "pregunta")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pre_id", nullable = false)
    private Integer id;

    @Column(name = "pre_pregunta", nullable = false, length = 200)
    private String prePregunta;

    @Column(name = "pre_respuesta1", nullable = false, length = 45)
    private String preRespuesta1;

    @Column(name = "pre_respuesta2", nullable = false, length = 45)
    private String preRespuesta2;

    @Column(name = "pre_respuesta3", nullable = false, length = 45)
    private String preRespuesta3;

    @Column(name = "pre_respuesta4", nullable = false, length = 45)
    private String preRespuesta4;

    @Column(name = "correcta", nullable = false, length = 45)
    private String correcta;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nivel_niv_id", nullable = false)
    private Nivel nivelNiv;


}