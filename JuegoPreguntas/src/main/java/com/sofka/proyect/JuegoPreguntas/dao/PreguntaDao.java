package com.sofka.proyect.JuegoPreguntas.dao;

import com.sofka.proyect.JuegoPreguntas.domain.Pregunta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PreguntaDao extends CrudRepository<Pregunta, Integer> {
//    @Query(value = "SELECT * " +
//            "FROM pregunta " +
//            "WHERE nivel_niv_id =  " +
//            "'1'")
    //public void findForlevel();
}