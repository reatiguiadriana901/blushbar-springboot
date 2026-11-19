package com.blushbar.blushbar.Controller;

import com.blushbar.blushbar.entity.Producto;
import com.blushbar.blushbar.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/productos")
    public List<Producto> productos() {
        return service.listar();
    }
}

