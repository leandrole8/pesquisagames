package com.leandroreis.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroreis.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}