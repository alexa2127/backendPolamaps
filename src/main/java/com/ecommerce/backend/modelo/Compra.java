package com.ecommerce.backend.modelo;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.text.DecimalFormat;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="compra")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idCompra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    @Column(name = "precio_total")
    private Float precioTotal;
    @Column(name = "cedula")
    private  Integer cedula;


    @JoinColumn(name = "id_regsitro")
    @ManyToOne
    Usuario usuario;



}
