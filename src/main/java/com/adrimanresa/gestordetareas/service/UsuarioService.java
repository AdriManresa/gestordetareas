package com.adrimanresa.gestordetareas.service;

import com.adrimanresa.gestordetareas.model.Usuario;
import com.adrimanresa.gestordetareas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario registrar(Usuario usuario) {
        // Hashear la contraseña antes de guardar
        usuario.setPassword(BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt()));
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorEmail(String email) {
        // Buscar usuario por email
        return usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
    }

    public boolean validarPassword(String email, String password) {
        // Validar la contraseña con el hash almacenado
        Usuario usuario = buscarPorEmail(email);
        return BCrypt.checkpw(password, usuario.getPassword());
    }
}
