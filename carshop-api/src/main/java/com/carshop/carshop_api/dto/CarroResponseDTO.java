package com.carshop.carshop_api.dto;

import com.carshop.carshop_api.entity.Carro;

public record CarroResponseDTO(Long id, String modelo, String placa, String cor, Integer ano) {
  public CarroResponseDTO(Carro carro) {
    this(carro.getId(), carro.getModelo(), carro.getPlaca(), carro.getCor(), carro.getAno());
}}
