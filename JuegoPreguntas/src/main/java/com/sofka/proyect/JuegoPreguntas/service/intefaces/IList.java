package com.sofka.proyect.JuegoPreguntas.service.intefaces;

import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IList {
    /**
     * Devuelve un usuario
     *
     * @return
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Optional<Usuario> getUser(Usuario usuario);

    /**
     * Crea un usuario
     *
     * @param usuario Objeto del contacto a crear
     * @return Objeto del contacto creado
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Usuario createUsuario(Usuario usuario);

    /**
     * Devuelve puntaje de usuario
     *
     * @return
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Optional<Puntaje> findPoint(Puntaje puntaje);

    /**
     * Crea un puntaje en la base de datos
     *
     * @param puntaje Objeto del teléfono a crear
     * @return Objeto del teléfono creado
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Puntaje createPuntaje(Puntaje puntaje);

    /**
     * Devuelve una lista de usuarios con su respectivo puntaje ordenado de mayor a menor
     *
     *
     * @return Lista de contactos
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public List<Puntaje> getList();
}
