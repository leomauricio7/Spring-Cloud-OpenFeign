package com.github.leomauricio7.client2.openfeigin2.service;

import com.github.leomauricio7.client2.openfeigin2.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "usuario", url = "http://localhost:8080/usuario")
public interface UsuarioService {

    @RequestMapping(method = RequestMethod.GET, value = "")
    Usuario getUsuario();
}
