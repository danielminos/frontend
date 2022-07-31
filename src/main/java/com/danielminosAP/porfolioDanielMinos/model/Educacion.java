package com.danielminosAP.porfolioDanielMinos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    
    private String institucion;
    private String titulo;
    private String carrera;
    private String desde;
    private String hasta;
    private String img;
    
    public Educacion() {
    }
    
    public Educacion(Long Id, String institucion, String titulo, String carrera, String desde, String hasta, String img){
        this.Id = Id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.carrera = carrera;
        this.desde = desde;
        this.hasta = hasta;
        this.img = img;
    }
}
