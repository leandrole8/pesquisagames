package com.leandroreis.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leandroreis.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}