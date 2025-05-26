package com.example.NUBEPLAY_INVENTARIO.repository;
import com.example.NUBEPLAY_INVENTARIO.model.InventarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface InventarioRepository extends JpaRepository&lt;InventarioModel,
Integer&gt; {
    List&lt;InventarioModel&gt; findByCategoriaIgnoreCase(String categoria);
    List&lt;InventarioModel&gt; findByStockLessThan(int stock);
}