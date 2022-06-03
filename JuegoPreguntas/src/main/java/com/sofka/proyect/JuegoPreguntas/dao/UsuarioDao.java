package com.sofka.proyect.JuegoPreguntas.dao;

import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {
}