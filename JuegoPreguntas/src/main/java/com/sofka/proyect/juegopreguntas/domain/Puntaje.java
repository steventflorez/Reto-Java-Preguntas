package com.sofka.proyect.juegopreguntas.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "puntaje")
public class Puntaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pun_id", nullable = false)
    private Integer id;

    @Column(name = "pun_puntaje", nullable = false, length = 45)
    private String punPuntaje;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_usu_id", nullable = false)
    private Usuario usuarioUsu;


}