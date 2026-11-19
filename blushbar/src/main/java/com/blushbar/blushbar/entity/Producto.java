package com.blushbar.blushbar.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String marca;

    @Column(nullable = false, precision = 19,scale =2)
    private BigDecimal precio;

    @Column(nullable = false)
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Producto(String nombre, String marca, BigDecimal precio, int stock, Categoria categoria) {

        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }

        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
}
