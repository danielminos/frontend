package com.danielminosAP.porfolioDanielMinos.Controller;

import com.danielminosAP.porfolioDanielMinos.model.Educacion;
import com.danielminosAP.porfolioDanielMinos.model.Experiencia;
import com.danielminosAP.porfolioDanielMinos.model.Persona;
import com.danielminosAP.porfolioDanielMinos.service.IEducacionService;
import com.danielminosAP.porfolioDanielMinos.service.IExperienciaService;
import com.danielminosAP.porfolioDanielMinos.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoService;
    
    @Autowired
    private IEducacionService educaService;
    
    @Autowired
    private IExperienciaService expeService;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoService.crearPersona(pers);
    }
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        educaService.crearEducacion(edu);
    }
    
    @PostMapping ("new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expeService.crearExperiencia(exp);
    }
    
    @PutMapping ("/editar/persona")
    public void editarPersona (@RequestBody Persona pers){
        persoService.crearPersona(pers);
    }
    
    @PutMapping ("/editar/educacion")
    public void editarEducacion (@RequestBody Educacion edu){
        educaService.editarEducacion(edu);
    }
    
    @PutMapping ("/editar/experiencia")
    public void editarExperiencia (@RequestBody Experiencia expe){
        expeService.editarExperiencia(expe);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoService.verPersona();
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educaService.verEducacion();
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeService.verExperiencia();
    }
    
    @DeleteMapping ("/borraper/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoService.borrarPersona(id);
    }
    
    @DeleteMapping ("/borraedu/{id}")
    public void borrarEducacion (@PathVariable Long id){
        educaService.borrarEducacion(id);
    }
    
    @DeleteMapping ("/borraexpe/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expeService.borrarExperiencia(id);
    }
}
