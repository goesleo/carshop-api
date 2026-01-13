package com.carshop.carshop_api.repository;

import com.carshop.carshop_api.model.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository  extends JpaRepository<Carro, Long> {
}
