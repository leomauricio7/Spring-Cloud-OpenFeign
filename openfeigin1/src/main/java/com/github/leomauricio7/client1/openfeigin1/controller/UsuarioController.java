package com.github.leomauricio7.client1.openfeigin1.controller;

import com.github.leomauricio7.client1.openfeigin1.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @GetMapping
    public Usuario getUsuario(){
        return Usuario.builder().nome("Leonardo Mauricio").email("leomauricio7@gmail.com").idade(25).build();
    }
}
