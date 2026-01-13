package com.carshop.carshop_api.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarroRequestDTO(

        @NotBlank
        String modelo,
        @NotBlank
        String placa,
        @NotBlank
        String cor,
        @NotBlank
        String marca,
        @NotNull
        @Min(1980)
        Integer ano
) {



}
