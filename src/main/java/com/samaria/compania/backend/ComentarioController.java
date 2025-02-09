package com.samaria.compania.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService service;

    @PostMapping("/guardar")
    public Comentario guardarComentario(@RequestBody Comentario comentario) {
        return service.guardarComentario(comentario);
    }

    @GetMapping("/listar")
    public List<Comentario> listarComentarios() {
        return service.obtenerComentarios();
    }
}
