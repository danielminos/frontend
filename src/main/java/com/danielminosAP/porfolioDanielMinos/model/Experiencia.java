package com.danielminosAP.porfolioDanielMinos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    private String empresa;
    private String sector;
    private String ocupacion;
    private String detalle;
    private String desde;
    private String hasta;
    
    public Experiencia() {
    }
    
    public Experiencia (Long Id, String empresa, String sector, String ocupacion, String detalle, String desde, String hasta){
        this.Id = Id;
        this.empresa = empresa;
        this.sector = sector;
        this.ocupacion = ocupacion;
        this.detalle = detalle;
        this.desde = desde;
        this.hasta = hasta;
    }
}
