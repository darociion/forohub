package com.challenge.forohub.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @GetMapping
    public String mostrarTopicos() {
        return "Probando, 1, 2, 3";
    }

    @PostMapping
    public void registrarTopico() {

    }

    @PutMapping
    public void actualizarTopico() {

    }

    @DeleteMapping
    public void eliminarTopico() {

    }

}
