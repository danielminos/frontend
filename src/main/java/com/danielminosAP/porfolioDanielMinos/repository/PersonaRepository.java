package com.danielminosAP.porfolioDanielMinos.repository;

import com.danielminosAP.porfolioDanielMinos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
