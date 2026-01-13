package com.carshop.carshop_api.model.dto;

import com.carshop.carshop_api.model.entity.Carro;

public record CarroResponseDTO(Long id, String modelo, String placa, String cor, Integer ano) {
  public CarroResponseDTO(Carro carro) {
    this(carro.getId(), carro.getModelo(), carro.getPlaca(), carro.getCor(), carro.getAno());
}}
