package com.carshop.carshop_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private Integer ano;



}
