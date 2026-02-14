package com.semana1.restspringmysql.repository;

import com.semana1.restspringmysql.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
