package com.sofka.proyect.JuegoPreguntas.dao;

import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import org.springframework.data.repository.CrudRepository;

public interface PuntajeDao extends CrudRepository<Puntaje, Integer> {
}