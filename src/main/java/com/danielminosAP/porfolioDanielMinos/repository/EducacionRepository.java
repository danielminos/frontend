package com.danielminosAP.porfolioDanielMinos.repository;

import com.danielminosAP.porfolioDanielMinos.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
