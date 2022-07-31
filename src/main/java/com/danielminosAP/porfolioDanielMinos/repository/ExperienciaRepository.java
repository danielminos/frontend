package com.danielminosAP.porfolioDanielMinos.repository;

import com.danielminosAP.porfolioDanielMinos.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
}
