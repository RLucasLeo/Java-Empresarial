package com.consiti.sga.servicio;

import com.consiti.domain.Persona;
import java.util.List;
import javax.annotation.security.PermitAll;
import javax.ejb.Local;

@Local
@PermitAll
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPeronsa(Persona persona);

}
