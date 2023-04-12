package com.ecommerce.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="registro")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idUsuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_regsitro")
    private int idUsuario;
    @Column(name = "usuario" )
    private String nombreUsuario;
    @Column(name = "correo",unique = true)
    private String email;
    @Column(name = "contraseña")
    private String password;

    @JoinColumn(name = "id_rol")
    @ManyToOne
    Rol rol;

    @OneToMany(mappedBy = "usuario")
    List<Compra> compra;

}
