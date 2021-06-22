package com.github.leomauricio7.client2.openfeigin2.controller;

import com.github.leomauricio7.client2.openfeigin2.model.Usuario;
import com.github.leomauricio7.client2.openfeigin2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public Usuario getUsuario(){
        return usuarioService.getUsuario();
    }
}
