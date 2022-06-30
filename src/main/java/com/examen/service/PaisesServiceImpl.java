package com.examen.service;


import com.examen.dao.PaisDao;
import com.examen.domain.Paises;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaisesServiceImpl implements PaisesService {

    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private PaisDao PaisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Paises> getPaises() {
        return (List<Paises>) PaisDao.findAll();
    }

    @Override
    @Transactional
    public void save(Paises estado) {
        PaisDao.save(estado);
    }

    @Override
    public void delete(Paises estado) {
        PaisDao.delete(estado);
    }

    @Override
    @Transactional(readOnly = true)
    public Paises getPais(Paises estado) {

        return PaisDao.findById(estado.getId_estado()).orElse(null);
    }

}
