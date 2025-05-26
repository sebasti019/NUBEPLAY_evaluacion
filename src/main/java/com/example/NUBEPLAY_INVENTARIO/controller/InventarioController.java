package com.example.NUBEPLAY_INVENTARIO.controller;
import com.example.NUBEPLAY_INVENTARIO.model.InventarioModel;
import com.example.NUBEPLAY_INVENTARIO.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(&quot;/api/v1/juegos/&quot;)
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;
    @GetMapping
    public List&lt;InventarioModel&gt; listarJuegos(@RequestParam(required =
false) String categoria,
                                             @RequestParam(required = false)Integer stock) {
        if (categoria != null) {
            return inventarioService.buscarCategoria(categoria);
        }
        if (stock != null) {
            return inventarioService.buscarStock(stock);
        }
        return inventarioService.getJuegos();
    }
    @PostMapping
    public InventarioModel agregarJuego(@RequestBody InventarioModel juego)
{
        return inventarioService.guardarJuego(juego);
    }
    @GetMapping(&quot;{id}&quot;)
    public InventarioModel buscarJuego(@PathVariable int id) {
        return inventarioService.buscarJuego(id);
    }
    @PutMapping(&quot;{id}&quot;)

    public InventarioModel actualizarJuego(@PathVariable int id,
@RequestBody InventarioModel juego) {
        juego.setIdJuego(id);
        return inventarioService.actualizarJuego(juego);
    }
    @DeleteMapping(&quot;{id}&quot;)
    public String eliminarJuego(@PathVariable int id) {
        return inventarioService.borrarJuego(id);
    }
}