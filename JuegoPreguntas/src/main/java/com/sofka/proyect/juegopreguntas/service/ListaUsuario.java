package com.sofka.proyect.juegopreguntas.service;

import com.sofka.proyect.juegopreguntas.dao.PuntajeDao;
import com.sofka.proyect.juegopreguntas.dao.UsuarioDao;
import com.sofka.proyect.juegopreguntas.domain.Puntaje;
import com.sofka.proyect.juegopreguntas.domain.Usuario;
import com.sofka.proyect.juegopreguntas.service.intefaces.IList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ListaUsuario implements IList {

    /**
     * Repositorio de Usuario
     */
    private final UsuarioDao usuarioDao;

    /**
     * Repositorio de Puntaje
     */
    private final PuntajeDao puntajeDao;

    public ListaUsuario(UsuarioDao usuarioDao, PuntajeDao puntajeDao) {
        this.usuarioDao = usuarioDao;
        this.puntajeDao = puntajeDao;
    }

    @Override
    @Transactional
    public Optional<Usuario> getUser(Usuario usuario) {
        return usuarioDao.findById(usuario.getId());
    }

    @Override
    @Transactional
    public Optional<Puntaje> getPuntajeUser(Puntaje puntaje) { return puntajeDao.findById(puntaje.getId());}


    @Override
    @Transactional
    public void createUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public Puntaje createPuntaje(Puntaje puntaje, Usuario usuario) {
        return puntajeDao.save(puntaje);
    }


    @Override
    @Transactional(readOnly = true)
    public List<Puntaje> getListPoints() {
        return ((List<Puntaje>) puntajeDao.findAll());
    }


}
