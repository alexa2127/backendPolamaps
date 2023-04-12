package com.ecommerce.backend.modelo;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="boletas")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="idBoletas")

public class Boletas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idBoletas;
        @Column(name = "nombreBoletas")
        private  String nombreBoleta;
        @Column(name = "descripcionBoleta")
        private  String descripcionBoleta;
        @Column(name = "cantidad")
        private  Integer cantidad;
        @Column(name = "precio")
        private  Float precio;
        @Column(name = "urlImgBoleta")
        private  String imgUrlBoleta;

        @Column(name = "fechaBoleta")
        //@JsonFormat(pattern = "yyyyMMdd")
        private Date fechaBoleta;


        @JoinColumn(name = "id_establecimientos")
        @ManyToOne
        Bares bares;


        @JoinColumn(name = "id_promocion")
        @ManyToOne
        Promocion promocion;


    }

