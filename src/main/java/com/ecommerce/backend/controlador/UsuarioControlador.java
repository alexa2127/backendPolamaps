package com.ecommerce.backend.controlador;

import com.ecommerce.backend.modelo.Rol;
import com.ecommerce.backend.modelo.Usuario;
import com.ecommerce.backend.servicio.RolServicio;
import com.ecommerce.backend.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("/usuario")
@RestController
public class UsuarioControlador {

        UsuarioServicio usuarioServicio;
    public UsuarioControlador(UsuarioServicio usuarioServicio){

        this.usuarioServicio=usuarioServicio;
    }
    List<Usuario> ro= new ArrayList<>();
        @GetMapping("/listar")
        public List<Usuario> obtener(){
            return usuarioServicio.obtener();
        }

        @PostMapping("/crear")
        public Usuario guardarUsuario(@RequestBody Usuario usuario){
            return this.usuarioServicio.guardarUsuario(usuario);
        }

        /*@GetMapping(path = "/{id}")
        public Optional<UsuarioModel> obtenerPorId(@PathVariable("id") int id){
            return this.servicio.obtenerPorId(id);
        }*/
        @GetMapping("/obtener-email/{email}")
        public Usuario obtenerPorEmail(@PathVariable("email") String email){
            return usuarioServicio.obtenerPorEmail(email);
        }
        @DeleteMapping(path = "/{id}")
        public String eliminarPorId(@PathVariable("id")int id){
            boolean ok = usuarioServicio.eliminarUsuario(id);
            if(ok){
                return "Se elimino el usuario con id "+id;
            }else{
                return "No se pudo eliminar el usuario con id "+id;
            }
        }
}
