
package com.examen.service;


import com.examen.domain.Paises;
import java.util.List;


public interface PaisesService {
    
    public List<Paises> getPaises();
    
    public void save (Paises estado);
    
    public void delete(Paises estado);
    
    public Paises getPais(Paises estado);
    
}
