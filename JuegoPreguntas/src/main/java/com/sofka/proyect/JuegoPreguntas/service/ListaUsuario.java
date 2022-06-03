package com.sofka.proyect.JuegoPreguntas.service;

import com.sofka.proyect.JuegoPreguntas.dao.PuntajeDao;
import com.sofka.proyect.JuegoPreguntas.dao.UsuarioDao;
import com.sofka.proyect.JuegoPreguntas.domain.Puntaje;
import com.sofka.proyect.JuegoPreguntas.domain.Usuario;
import com.sofka.proyect.JuegoPreguntas.service.intefaces.IList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ListaUsuario implements IList {

    /**
     * Repositorio de Usuario
     */
    @Autowired
    private UsuarioDao usuarioDao;

    /**
     * Repositorio de Puntaje
     */
    @Autowired
    private PuntajeDao puntajeDao;

    @Override
    @Transactional
    public Optional<Usuario> getUser(Usuario usuario) {
        return usuarioDao.findById(usuario.getId());
    }

    @Override
    @Transactional
    public Usuario createUsuario(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public Optional<Puntaje> findPoint(Puntaje puntaje) {
        return puntajeDao.findById(puntaje.getId());
    }

    @Override
    @Transactional
    public Puntaje createPuntaje(Puntaje puntaje) {
        return puntajeDao.save(puntaje);
    }

    @Override
    @Transactional
    public List<Puntaje> getList() {
        return ((List<Puntaje>) puntajeDao.findAll());
    }
}
