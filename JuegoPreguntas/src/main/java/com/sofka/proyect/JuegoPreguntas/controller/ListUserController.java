package com.sofka.proyect.JuegoPreguntas.controller;


import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import com.sofka.proyect.JuegoPreguntas.service.ListaUsuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:3000", methods =
        {RequestMethod.GET, RequestMethod.POST})
public class ListUserController {
    @Autowired
    private ListaUsuario listaUsuario;

    @GetMapping(path = "/user/{id}")
    public Optional<Usuario> getUser(Usuario usuario) {
        return listaUsuario.getUser(usuario);
    }

    @PostMapping(path = "/user")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        listaUsuario.createUsuario(usuario);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
    }

//    @PostMapping(path = "/points/{id}")
//    public Puntaje createPuntaje(@RequestBody Puntaje puntaje, Usuario usuario){
//        for (Puntaje iterator : listaUsuario.getList()) {
//
//        }
//    }

    @GetMapping(path ="/points" )
    public List<Puntaje> getList(){
        return listaUsuario.getList();
    }

}
