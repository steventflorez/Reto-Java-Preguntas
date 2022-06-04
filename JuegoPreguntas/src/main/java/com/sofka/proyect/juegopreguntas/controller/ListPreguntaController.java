package com.sofka.proyect.juegopreguntas.controller;


import com.sofka.proyect.juegopreguntas.domain.Pregunta;
import com.sofka.proyect.juegopreguntas.service.ListaPregunta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Controlador para la lista de preguntas
 *
 * @version 1.0.0 2022-06-03
 * @author Stivent Alfonso Florez Peña - steventflorez94@gmail.com
 * @since 1.0.0
 */
@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000", methods =
        {RequestMethod.GET, RequestMethod.POST})
public class ListPreguntaController {

    /**
     * Servicio para el manejo de la libreta
     */
    private final ListaPregunta listaPregunta;
    public ListPreguntaController(ListaPregunta listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    /**
     * Obtiene una pregunta en particular almacenadas en la BD
     * Atención a la dirección raíz del sistema, este redirige a /pregunta{id}/
     *
     * @param pregunta Objeto tipo pregunta al cual se le extrae el id para hacer la peticion
     * @return Objeto Optional en formato JSON
     *
     * @author Stivent Alfonso Florez Peña - steventflorez94@gmail.com
     * @since 1.0.0
     */
    @GetMapping(path = "/pregunta/{id}")
    public Optional<Pregunta> getPregunta(Pregunta pregunta) {return listaPregunta.getPregunta(pregunta);
    }

    /**
     * Obtiene el listado de preguntas almacenadas en la BD
     * Atención a la dirección raíz del sistema, este redirige a /pregunta/
     *
     * @return Objeto tipo lista en formato JSON
     *
     * @author Stivent Alfonso Florez Peña - steventflorez94@gmail.com
     * @since 1.0.0
     */
    @GetMapping(path = "/pregunta")
    public List<Pregunta> getListPregunta(){
       return listaPregunta.getListPregunta();
    }
}
