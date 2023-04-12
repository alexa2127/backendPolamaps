package com.ecommerce.backend.repositorio;

import com.ecommerce.backend.modelo.Boletas;
import com.ecommerce.backend.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    public abstract Usuario findByEmail(String email);
}
