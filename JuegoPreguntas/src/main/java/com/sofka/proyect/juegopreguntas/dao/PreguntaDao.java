package com.sofka.proyect.juegopreguntas.dao;

import com.sofka.proyect.juegopreguntas.domain.Pregunta;
import org.springframework.data.repository.CrudRepository;

public interface PreguntaDao extends CrudRepository<Pregunta, Integer> {

}