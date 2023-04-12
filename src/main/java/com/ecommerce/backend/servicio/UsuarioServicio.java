package com.ecommerce.backend.servicio;

import com.ecommerce.backend.modelo.Usuario;
import com.ecommerce.backend.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class UsuarioServicio {

   UsuarioRepositorio usuarioRepotorio;
    public UsuarioServicio(UsuarioRepositorio usuarioRepotorio){

        this.usuarioRepotorio=usuarioRepotorio;
    }

    public List<Usuario> obtener(){
        return (List<Usuario>) usuarioRepotorio.findAll();
    }
    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepotorio.save(usuario);
    }
    public Optional<Usuario> obtenerPorId(int id){
        return usuarioRepotorio.findById(id);
    }
    public Usuario obtenerPorEmail(String email){
        return usuarioRepotorio.findByEmail(email);
    }

    public boolean eliminarUsuario(int id) {
        try {
            usuarioRepotorio.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
