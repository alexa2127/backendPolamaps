package com.ecommerce.backend.controlador;


import com.ecommerce.backend.modelo.Rol;
import com.ecommerce.backend.servicio.RolServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("/rol")
@RestController
public class RolControlador {
   RolServicio rolServicio;

    public RolControlador(RolServicio rolServicio){

        this.rolServicio=rolServicio;
    }
    List<Rol> ro= new ArrayList<>();

    @PostMapping("/crear")
    public Object crearRol(@RequestBody Rol rol){

        return rolServicio.crearRol(rol);
    }
    @GetMapping("/listar")
    public List<Rol> buscarTodo(){

        return rolServicio.buscarTodo();
    }
}
