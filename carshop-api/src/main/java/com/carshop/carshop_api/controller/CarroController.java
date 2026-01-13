package com.carshop.carshop_api.controller;

import com.carshop.carshop_api.model.dto.CarroRequestDTO;
import com.carshop.carshop_api.model.dto.CarroResponseDTO;
import com.carshop.carshop_api.model.entity.Carro;
import com.carshop.carshop_api.service.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/carros")
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

    @GetMapping("/{id}")
    public CarroResponseDTO buscarPorId(@PathVariable Long id) {
        return carroService.buscarPorId(id);
    }
    @PostMapping
    public CarroResponseDTO create(@RequestBody @Valid CarroRequestDTO data) {
        return carroService.create(data);
    }
}
