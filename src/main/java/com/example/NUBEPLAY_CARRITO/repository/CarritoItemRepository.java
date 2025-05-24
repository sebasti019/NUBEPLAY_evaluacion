package com.example.NUBEPLAY_CARRITO.repository;

import com.example.NUBEPLAY_CARRITO.model.CarritoItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarritoItemRepository extends JpaRepository<CarritoItemRepository, Integer> {
    List<CarritoItemModel> findByCarritoIdCarrito(Integer idCarrito);
    
}
