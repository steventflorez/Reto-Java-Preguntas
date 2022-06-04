package com.sofka.proyect.JuegoPreguntas.service;


import com.sofka.proyect.JuegoPreguntas.dao.NivelDao;
import com.sofka.proyect.JuegoPreguntas.dao.PreguntaDao;
import com.sofka.proyect.JuegoPreguntas.dao.UsuarioDao;
import com.sofka.proyect.JuegoPreguntas.domain.Nivel;
import com.sofka.proyect.JuegoPreguntas.domain.Pregunta;
import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.service.intefaces.Ipregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ListaPregunta implements Ipregunta {
    /**
     * Repositorio de Nivel
     */
    @Autowired
    private NivelDao nivelDao;

    /**
     * Repositorio de pregunta
     */
    @Autowired
    private PreguntaDao preguntaDao;

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








//    @Transactional
//    public void findforlevel(){
//
//        preguntaDao.findForlevel();
//    }

    @Override
    @Transactional
    public Optional<Nivel> getNivel(Nivel nivel) {

        return nivelDao.findById(nivel.getId());
    }
}
