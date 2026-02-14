package com.semana1.restspringmysql.service;

import com.semana1.restspringmysql.entity.Pelicula;
import com.semana1.restspringmysql.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {
    @Autowired
    private PeliculaRepository repo;

    public List<Pelicula> listar() { return repo.findAll(); }
    public Optional<Pelicula> buscarPorId(Long id) { return repo.findById(id); }
    public Pelicula guardar(Pelicula p) { return repo.save(p); }
    public Pelicula actualizar(Long id, Pelicula p) {
        p.setId(id);
        return repo.save(p);
    }
    public void eliminar(Long id) { repo.deleteById(id); }
}
