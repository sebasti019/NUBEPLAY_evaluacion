package com.example.NUBEPLAY_CARRITO.service;

import com.example.NUBEPLAY_CARRITO.model.CarritoModel;
import com.example.NUBEPLAY_CARRITO.model.CarritoItemModel;
import com.example.NUBEPLAY_CARRITO.repository.CarritoRepository;
import com.example.NUBEPLAY_CARRITO.repository.CarritoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private CarritoItemRepository carritoItemRepository;

    public CarritoItemModel crearCarrito(CarritoItemModel carrito) {
        return carritoRepository.save(carrito);
    }

    public CarritoItemModel agregarItem(int idCarrito, int idJuego, int cantidad) {
        Optional<CarritoModel> carritoOpt = carritoRepository.findById(idCarrito);
        if (carritoOpt.isEmpty()) {
            throw new RuntimeException("Carrito no encontrado");
        }
        CarritoEntity carrito = carritoOpt.get();

        CarritoItemEntity item = new CarritoItemEntity();
        item.setCarrito(carrito);
        item.setIdJuego(idJuego);
        item.setCantidad(cantidad);

        return carritoItemRepository.save(item);
    }

    public List<CarritoItemEntity> obtenerItems(int idCarrito) {
        return carritoItemRepository.findByCarritoIdCarrito(idCarrito);
    }

    public Optional<CarritoEntity> buscarCarrito(int idCarrito) {
        return carritoRepository.findById(idCarrito);
    }
    
}