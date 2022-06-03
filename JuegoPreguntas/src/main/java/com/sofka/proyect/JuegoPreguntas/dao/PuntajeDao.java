package com.sofka.proyect.JuegoPreguntas.dao;

import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PuntajeDao extends CrudRepository<Puntaje, Integer> {

}