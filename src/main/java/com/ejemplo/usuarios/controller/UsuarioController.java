package com.ejemplo.usuarios.controller;

import com.ejemplo.usuarios.models.Usuario;
import com.ejemplo.usuarios.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Usuario")
public class UsuarioController {
    @Autowired
    private usuarioRepository usuarioRepository;

    @GetMapping("/getAllUsuario")
    public List<Usuario> getAllUsuario(){
        return usuarioRepository.findAll();
    }

    @PostMapping("/create")
    public Usuario createUsuario(@RequestBody Usuario Usuario){
        return usuarioRepository.save(Usuario);
    }
}
