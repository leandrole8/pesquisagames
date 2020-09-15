package com.leandroreis.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroreis.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}