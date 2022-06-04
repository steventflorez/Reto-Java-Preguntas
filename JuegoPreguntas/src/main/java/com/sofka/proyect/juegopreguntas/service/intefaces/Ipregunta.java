package com.sofka.proyect.juegopreguntas.service.intefaces;


import com.sofka.proyect.juegopreguntas.domain.Pregunta;

import java.util.List;
import java.util.Optional;

public interface Ipregunta {
    /**
     * Devuelve una pregunta
     *
     * @return obtiene pregunta segun id
     * @author Stivent Alfonso Florez Peña - steventflorez94@gmail.com
     * @since 1.0.0
     */
    Optional<Pregunta> getPregunta(Pregunta pregunta);

    /**
     * Devuelve una pregunta
     *
     * @return lista de todos los elementos de la tabla
     * @author Julian Lasso <julian.lasso@sofka.com.co>
     * @since 1.0.0
     */

    List<Pregunta> getListPregunta();

}
