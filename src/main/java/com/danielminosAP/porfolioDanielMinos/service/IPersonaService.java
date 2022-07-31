package com.danielminosAP.porfolioDanielMinos.service;

import com.danielminosAP.porfolioDanielMinos.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> verPersona();
    
    public void crearPersona (Persona per);
    
    public void editarPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);    
}
