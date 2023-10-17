package com.consiti.sga.servicio;

import com.consiti.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PeronsaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Robledo", "pepito@gmail.com", 3813633));
        personas.add(new Persona(2, "Lucas", "Robledo", "pepito@gmail.com", 3813633));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPeronsa(Persona persona) {
    }
    
}
