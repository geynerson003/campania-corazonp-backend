package com.samaria.compania.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository repository;

    public Comentario guardarComentario(Comentario comentario) {
        return repository.save(comentario);
    }

    public List<Comentario> obtenerComentarios() {
        return repository.findAll();
    }
}

