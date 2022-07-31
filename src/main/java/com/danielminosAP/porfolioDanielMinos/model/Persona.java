package com.danielminosAP.porfolioDanielMinos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String fenac;
    private String posicion;
    private String posicion2;
    private String acerca;
    private String acerca2;
    private String mail;
    private String ubicacion;

    public Persona() {
    }

   public Persona(Long id, String nombre, String fenac, String posicion, String posicion2, String acerca, String acerca2, String mail, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.fenac = fenac;
        this.posicion = posicion;
        this.posicion2 = posicion2;
        this.acerca = acerca;
        this.acerca2 = acerca2;
        this.mail = mail;
        this.ubicacion = ubicacion;
    }
}


