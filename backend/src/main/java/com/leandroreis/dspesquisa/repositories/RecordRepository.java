package com.leandroreis.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroreis.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}