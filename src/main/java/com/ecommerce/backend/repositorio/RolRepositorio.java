package com.ecommerce.backend.repositorio;


import com.ecommerce.backend.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Integer> {
}
