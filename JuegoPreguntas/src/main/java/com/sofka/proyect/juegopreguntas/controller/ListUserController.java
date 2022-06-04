package com.sofka.proyect.juegopreguntas.controller;


import com.sofka.proyect.juegopreguntas.domain.Puntaje;
import com.sofka.proyect.juegopreguntas.domain.Usuario;
import com.sofka.proyect.juegopreguntas.service.ListaUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


/**
 * Controlador para la lista de usuarios y puntajes
 *
 * @version 1.0.0 2022-06-03
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @since 1.0.0
 */
@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000", methods =
        {RequestMethod.GET, RequestMethod.POST})
public class ListUserController {

    /**
     * Servicio para el manejo de la libreta
     */
    @Autowired
    private ListaUsuario listaUsuario;

    /**
     * Obtiene un usuario en particular almacenadas en la BD
     * Atención a la dirección raíz del sistema, este redirige a /user/{id}
     *
     * @param usuario Objeto tipo usuario al cual se le extrae el id para hacer la peticion
     * @return Objeto Optional en formato JSON
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since 1.0.0
     */
    @GetMapping(path = "/user/{id}")
    public Optional<Usuario> getUser(Usuario usuario) {
         return listaUsuario.getUser(usuario);
    }

    /**
     * Obtiene un los puntos de un usuario en particular almacenadas en la BD
     * Atención a la dirección raíz del sistema, este redirige a /points/{id}
     *
     * @param puntaje Objeto tipo puntaje al cual se le extrae el id para hacer la peticion
     * @return Objeto Optional en formato JSON
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since 1.0.0
     */
    @GetMapping(path = "/points/{id}")
    public Optional<Puntaje> getPuntajeUser(Puntaje puntaje) {
        return listaUsuario.getPuntajeUser(puntaje);
    }

    /**
     * Crea el usuario con una peticion post en la tabla correspondiente
     * Atención a la dirección raíz del sistema, este redirige a /user
     *
     * @param usuario Objeto tipo usuario que es el elemento que se agregara a la tabla
     * @return Objeto ResposeEntity en formato JSON
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since 1.0.0
     */
    @PostMapping(path = "/user")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        listaUsuario.createUsuario(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    /**
     * Crea el puntaje de el usuario con una peticion post en la tabla correspondiente
     * Atención a la dirección raíz del sistema, este redirige a /points/{id}
     *
     * @param puntaje elemento tipo puntaje que sera almacenado en al base de datos
     * @param usuario Objeto tipo usuario que es el elemento que se tiene como referencia para almacenar en la BD
     * @return Objeto Puntaje formato JSON
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since 1.0.0
     */
    @PostMapping(path = "/points/{id}")
    public Puntaje createPuntaje(@RequestBody Puntaje puntaje, Usuario usuario) {
        puntaje.setUsuarioUsu(usuario);
        return listaUsuario.createPuntaje(puntaje, usuario);
    }

    /**
     * Obtiene el listado de puntos usuarios
     * Atención a la dirección raíz del sistema, este redirige a /points
     *
     * @return Objeto List en formato JSON
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since 1.0.0
     */
    @GetMapping(path ="/points" )
    public List<Puntaje> getList(){
        return listaUsuario.getListPoints();
    }

}
