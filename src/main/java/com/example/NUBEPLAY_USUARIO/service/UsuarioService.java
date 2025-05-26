package com.example.NUBEPLAY_USUARIO.service;

import com.example.NUBEPLAY_USUARIO.model.UsuarioModel;
import com.example.NUBEPLAY_USUARIO.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Buscar usuarios por rol
    public List<UsuarioModel> buscarPorRol(String rol) {
        return usuarioRepository.findByRolIgnoreCase(rol);
    }

    // Buscar usuarios por si están activos o no
    public List<UsuarioModel> buscarPorActivo(Boolean activo) {
        return usuarioRepository.findByActivo(activo);
    }

    // Borrar usuario por ID
    public void borrarUsuario(int id) {
        usuarioRepository.deleteById(id);
    }

    // Obtener todos los usuarios
    public List<UsuarioModel> getUsuarios() {
        return usuarioRepository.findAll();
    }

    // Guardar un usuario (crear o actualizar)
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    // Buscar usuario por ID
    public Optional<UsuarioModel> buscarUsuario(int id) {
        return usuarioRepository.findById(id);
    }
}
