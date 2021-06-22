package com.github.leomauricio7.client2.openfeigin2.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private String nome;
    private String email;
    private Integer idade;
}
