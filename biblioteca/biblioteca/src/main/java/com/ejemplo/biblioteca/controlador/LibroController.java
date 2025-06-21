package com.ejemplo.biblioteca.controlador;

import com.ejemplo.biblioteca.modelo.libro;
import com.ejemplo.biblioteca.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    // Obtener todos los libros
    @GetMapping
    public List<libro> obtenerTodos() {
        return libroRepository.findAll();
    }

    // Obtener libro por ID
    @GetMapping("/{id}")
    public ResponseEntity<libro> obtenerPorId(@PathVariable Long id) {
        return libroRepository.findById(id)
                .map(libro -> ResponseEntity.ok().body(libro))
                .orElse(ResponseEntity.notFound().build());
    }

    // Crear nuevo libro
    @PostMapping
    public libro crearLibro(@RequestBody libro libro) {
        return libroRepository.save(libro);
    }

    // Actualizar libro existente
    @PutMapping("/{id}")
    public ResponseEntity<libro> actualizarLibro(@PathVariable Long id, @RequestBody libro libroDetalles) {
        return libroRepository.findById(id)
                .map(libro -> {
                    libro.setTitulo(libroDetalles.getTitulo());
                    libro.setAutor(libroDetalles.getAutor());
                    libro.setGenero(libroDetalles.getGenero());
                    libro.setAnioPublicacion(libroDetalles.getAnioPublicacion());
                    return ResponseEntity.ok(libroRepository.save(libro));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar libro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id) {
        if (!libroRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        libroRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
