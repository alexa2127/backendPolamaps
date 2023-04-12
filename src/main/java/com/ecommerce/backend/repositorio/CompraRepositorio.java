package com.ecommerce.backend.repositorio;

import com.ecommerce.backend.modelo.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepositorio extends JpaRepository<Compra, Integer> {
}
