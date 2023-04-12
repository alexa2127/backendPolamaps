package com.ecommerce.backend.servicio;

import com.ecommerce.backend.modelo.Bares;
import com.ecommerce.backend.modelo.Compra;
import com.ecommerce.backend.repositorio.BaresRepositorio;
import com.ecommerce.backend.repositorio.CompraRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompraServicio {
    CompraRepositorio compraRepositorio;

    public CompraServicio(CompraRepositorio compraRepositorio) {
        this.compraRepositorio = compraRepositorio;
    }

    public Object crearCompra(Compra compra) {

        return compraRepositorio.save(compra);
    }

    public Object buscarCompraPorId(Integer idCompra) {
        return compraRepositorio.findById(idCompra);
    }


    public List<Compra> buscarTodo() {
        return compraRepositorio.findAll();
    }

    public void borrarCompra(Integer idCompra) {
        compraRepositorio.deleteById(idCompra);
    }


}
