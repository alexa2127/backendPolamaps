package com.ecommerce.backend.servicio;

import com.ecommerce.backend.modelo.Bares;
import com.ecommerce.backend.modelo.Rol;
import com.ecommerce.backend.repositorio.PromocionRepositorio;
import com.ecommerce.backend.repositorio.RolRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicio {
    RolRepositorio rolRepositorio;
    public RolServicio(RolRepositorio rolRepositorio) {
        this.rolRepositorio = rolRepositorio;
    }
    public Object crearRol(Rol rol){

        return rolRepositorio.save(rol);
    }
    public List<Rol> buscarTodo(){
        return rolRepositorio.findAll();
    }
}
