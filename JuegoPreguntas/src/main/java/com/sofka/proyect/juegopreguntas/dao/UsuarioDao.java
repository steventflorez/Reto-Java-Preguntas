package com.sofka.proyect.juegopreguntas.dao;

import com.sofka.proyect.juegopreguntas.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

}