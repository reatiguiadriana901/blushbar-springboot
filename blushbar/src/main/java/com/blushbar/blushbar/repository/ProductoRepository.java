package com.blushbar.blushbar.repository;

import com.blushbar.blushbar.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
