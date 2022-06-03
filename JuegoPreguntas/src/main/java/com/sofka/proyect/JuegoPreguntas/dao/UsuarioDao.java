package com.sofka.proyect.JuegoPreguntas.dao;

import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

}