package com.ecommerce.backend.controlador;



import com.ecommerce.backend.modelo.Compra;
import com.ecommerce.backend.servicio.CompraServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/compra")
public class CompraControlador {
    CompraServicio compraServicio;

    public CompraControlador(CompraServicio compraServicio){
        this.compraServicio=compraServicio;
    }
    List<Compra> com= new ArrayList<>();

    @PostMapping("/crear")
    public Object crearCompra(@RequestBody Compra compra){

        return compraServicio.crearCompra(compra);
    }
    @GetMapping("/{idCompra}")
    public Object buscarBaresPorId(@PathVariable Integer idCompra){

        return compraServicio.buscarCompraPorId(idCompra);
    }
    @GetMapping("/listar")
    public List<Compra> buscarTodo(){

        try{
            return compraServicio.buscarTodo();
        }catch(Exception e){

        }
        return  null;
    }

    @DeleteMapping("/borrar/{idCompra}")
    public void borrarCompra(@PathVariable Integer idCompra){
        compraServicio.borrarCompra(idCompra);
    }




}
