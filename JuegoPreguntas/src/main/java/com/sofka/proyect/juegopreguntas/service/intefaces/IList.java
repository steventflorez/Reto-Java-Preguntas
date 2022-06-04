package com.sofka.proyect.juegopreguntas.service.intefaces;

import com.sofka.proyect.juegopreguntas.domain.Puntaje;
import com.sofka.proyect.juegopreguntas.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface IList {
    /**
     * Devuelve un usuario
     *
     * @return objeto
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    Optional<Usuario> getUser(Usuario usuario);

    /**
     * Devuelve un usuario
     *
     * @return tipo Optional
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    Optional<Puntaje> getPuntajeUser(Puntaje puntaje);

     /**
     * Crea un usuario
     *
     * @param usuario Objeto del usuario a crear
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    void createUsuario(Usuario usuario);


    /**
     * Crea un puntaje en la base de datos
     *
     * @param puntaje Objeto del puntaje a crear
     * @param usuario usuario con el que aplica la relacion
     *
     * @return Objeto del puntaje creado
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    Puntaje createPuntaje(Puntaje puntaje, Usuario usuario);

    /**
     * Devuelve una lista de usuarios con su respectivo puntaje ordenado de mayor a menor
     *
     *
     * @return Lista de contactos
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    List<Puntaje> getListPoints();


}
