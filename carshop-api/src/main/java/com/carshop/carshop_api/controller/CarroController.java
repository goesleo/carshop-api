package com.carshop.carshop_api.controller;

import com.carshop.carshop_api.entity.Carro;
import com.carshop.carshop_api.repository.CarroRepository;
import com.carshop.carshop_api.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
    @Autowired
    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping
    public List<Carro> listar() {
        return carroService.listarTodos();
    }
}
