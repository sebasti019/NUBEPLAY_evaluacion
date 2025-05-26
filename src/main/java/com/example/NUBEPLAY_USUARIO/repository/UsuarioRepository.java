package com.example.NUBEPLAY_USUARIO.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NUBEPLAY_USUARIO.model.UsuarioModel;

public class UsuarioRepository {
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
