package com.ecommerce.backend.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="rol")
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "nombre")
    private  String nombreRol;
    @Column(name = "descripcion")
    private  String descripcionRol;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    List<Usuario> usuario;

}