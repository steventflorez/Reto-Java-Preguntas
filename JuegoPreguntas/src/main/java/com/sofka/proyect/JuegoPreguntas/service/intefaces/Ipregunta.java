package com.sofka.proyect.JuegoPreguntas.service.intefaces;

import com.sofka.proyect.JuegoPreguntas.domain.Nivel;
import com.sofka.proyect.JuegoPreguntas.domain.Pregunta;
import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface Ipregunta {
    /**
     * Devuelve una pregunta
     *
     * @return
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */
    public Optional<Pregunta> getPregunta(Pregunta pregunta);

    /**
     * Devuelve una pregunta
     *
     * @return
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */

    public List<Pregunta> getListPregunta();
    public Optional<Nivel> getNivel(Nivel nivel);
}
