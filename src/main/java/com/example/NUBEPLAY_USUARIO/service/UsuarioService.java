package com.example.NUBEPLAY_USUARIO.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NUBEPLAY_USUARIO.model.UsuarioModel;
import com.example.NUBEPLAY_USUARIO.repository.UsuarioRepository;

public class UsuarioService {
     @Autowired
    private UsuarioRepository usuarioRepository;


    public List<UsuarioModel> getUsuarios() {
        return usuarioRepository.findAll();
    }


    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }


    public Optional<UsuarioModel> buscarUsuario(int id) {
        return usuarioRepository.findById(id);
    }

    
}
