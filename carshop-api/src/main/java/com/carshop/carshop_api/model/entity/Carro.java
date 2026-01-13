package com.carshop.carshop_api.model.entity;

import com.carshop.carshop_api.model.dto.CarroRequestDTO;
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

    public Carro(CarroRequestDTO data){
        this.modelo = data.modelo();
        this.marca = data.marca();
        this.placa = data.placa();
        this.cor = data.cor();
        this.ano = data.ano();
    }



}
