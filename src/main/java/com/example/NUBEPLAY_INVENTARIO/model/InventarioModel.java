package com.example.NUBEPLAY_INVENTARIO.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = &quot;inventario&quot;)
@Data
public class InventarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = &quot;id_juego&quot;)
    private int idJuego;
    @Column(name = &quot;titulo_juego&quot;, nullable = false)
    private String tituloJuego;
    @Column(name = &quot;categoria&quot;, nullable = false)
    private String categoria;
    @Column(name = &quot;stock&quot;)
    private int stock;
    @Column(name = &quot;precio&quot;)
    private double precio;
    @Column(name = &quot;rating_contenido&quot;)
    private int ratingContenido;
}