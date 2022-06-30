package com.examen.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Paises implements Serializable {

    //generacion de la llave primaria auto incremental
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_estado;
    
    String pais;
    String capital;
    String poblacion;
    String costas;

    public Paises() {
    }

    public Paises(String pais, String capital, String poblacion, String costas) {
        this.pais = pais;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    

}
