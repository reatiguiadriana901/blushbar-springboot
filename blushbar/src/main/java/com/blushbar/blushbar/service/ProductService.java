package com.blushbar.blushbar.service;

import com.blushbar.blushbar.entity.Producto;
import com.blushbar.blushbar.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductoRepository productoRepository;

    public ProductService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listar() {
        return productoRepository.findAll();
    }
}