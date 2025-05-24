package com.example.NUBEPLAY_CARRITO.repository;

import com.example.NUBEPLAY_CARRITO.repository.CarritoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<CarritoRepository, Integer> {

    
}