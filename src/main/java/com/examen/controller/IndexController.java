
package com.examen.controller;


import com.examen.dao.PaisDao;
import com.examen.domain.Paises;
import com.examen.service.PaisesService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/* Esos 2 arrobas es para indicar que esa es la clase controladora*/
@Controller
@Slf4j


public class IndexController {
    
    @Autowired
    private PaisesService paisService;
    
    /*Para iniciar este metodo por default*/
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora se usa estructura MVC");
        
        
        
        var paises = paisService.getPaises();
                
        
        model.addAttribute("paises",paises);
        
        return "index";
    }
    
    
    @GetMapping("/nuevoPais")
    public String nuevoPais(Paises estado){
    
    
    return  "modificarPais";
    }
    
    
    
    
    
    
    @PostMapping("/guardarPais")
    public String guardarPais(Paises estado){
    paisService.save(estado);
    
    return  "redirect:/";
    }
    
    
    
    
    
    
    @GetMapping("/modificarPais/{id_estado}")
    public String modificarPais(Paises estado, Model model){
    estado=paisService.getPais(estado);
    model.addAttribute("estado",estado);
    
    return  "modificarPais";
    }
    
    @GetMapping("/eliminarPais/{id_estado}")
    public String eliminarPais(Paises estado){
    paisService.delete(estado);
    
    
    return  "redirect:/";
    }
    
}
