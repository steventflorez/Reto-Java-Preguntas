package com.sofka.proyect.JuegoPreguntas.controller;


import com.sofka.proyect.JuegoPreguntas.domain.Nivel;
import com.sofka.proyect.JuegoPreguntas.domain.Pregunta;
import com.sofka.proyect.JuegoPreguntas.service.ListaPregunta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000", methods =
        {RequestMethod.GET, RequestMethod.POST})
public class ListPreguntaController {
    @Autowired
    private ListaPregunta listaPregunta;

    @GetMapping(path = "/pregun")
    public Optional<Pregunta> getPregunta(Pregunta pregunta) {return listaPregunta.getPregunta(pregunta);
    }
    @GetMapping(path = "/pregunta")
    public List<Pregunta> getListPregunta(){
       return listaPregunta.getListPregunta();
    }
}
