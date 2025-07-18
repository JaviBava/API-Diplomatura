package com.ejemplo.usuarios.repository;

import com.ejemplo.usuarios.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface usuarioRepository extends JpaRepository<Usuario, Long>{

    List<Usuario> findAll();
}
