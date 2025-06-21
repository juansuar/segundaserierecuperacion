package com.ejemplo.biblioteca.repositorio;

import com.ejemplo.biblioteca.modelo.libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<libro, Long> {
}
