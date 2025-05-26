package com.example.NUBEPLAY_USUARIO.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;


    @Column(nullable = false, length = 100)
    private String nombre;


    @Column(nullable = false, unique = true, length = 150)
    private String correo;


    @Column(nullable = false)
    private String password;


    @Column(nullable = false, length = 50)
    private String rol;


    @Column(nullable = false)
    private boolean activo;

}
