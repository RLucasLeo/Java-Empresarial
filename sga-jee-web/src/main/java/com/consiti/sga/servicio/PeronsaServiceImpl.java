package com.consiti.sga.servicio;

import com.consiti.domain.Persona;
import com.consiti.sga.datos.PersonaDao;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PeronsaServiceImpl implements PersonaServiceRemote, PersonaService{
    
    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.fundPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPeronsa(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
