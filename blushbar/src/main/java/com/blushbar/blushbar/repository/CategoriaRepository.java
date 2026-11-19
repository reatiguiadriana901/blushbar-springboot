package com.blushbar.blushbar.repository;

import com.blushbar.blushbar.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}