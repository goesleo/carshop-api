package com.carshop.carshop_api.service;

import com.carshop.carshop_api.model.dto.CarroRequestDTO;
import com.carshop.carshop_api.model.dto.CarroResponseDTO;
import com.carshop.carshop_api.model.entity.Carro;
import com.carshop.carshop_api.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private final CarroRepository carroRepository;
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

       public CarroResponseDTO create(CarroRequestDTO data) {
        // 1. Converter o DTO para Entidade
        Carro carro = new Carro(data);

        // 2. Salvar no banco
        carroRepository.save(carro);

        // 3. Retornar o DTO de resposta
        return new CarroResponseDTO(carro);
    }


    public CarroResponseDTO buscarPorId(Long id) {
        Carro carro = carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carro nao encontrado") );
        return new CarroResponseDTO(carro);
    }
}
