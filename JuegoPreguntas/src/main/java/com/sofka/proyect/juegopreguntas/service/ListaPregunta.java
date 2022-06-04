package com.sofka.proyect.juegopreguntas.service;


import com.sofka.proyect.juegopreguntas.dao.PreguntaDao;
import com.sofka.proyect.juegopreguntas.domain.Pregunta;
import com.sofka.proyect.juegopreguntas.service.intefaces.Ipregunta;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ListaPregunta implements Ipregunta {

    /**
     * Repositorio de pregunta
     */
    private final PreguntaDao preguntaDao;

    public ListaPregunta(PreguntaDao preguntaDao) {
        this.preguntaDao = preguntaDao;
    }

    @Override
    @Transactional
    public Optional<Pregunta> getPregunta(Pregunta pregunta) {
        return preguntaDao.findById(pregunta.getId());
    }

    @Override
    @Transactional
    public List<Pregunta> getListPregunta() {
        return ((List<Pregunta>) preguntaDao.findAll());
    }


}
