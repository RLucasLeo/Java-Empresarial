package com.consiti.sga.cliente;

import com.consiti.domain.Persona;
import com.consiti.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.*;

public class ClientPersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada desde el cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PeronsaServiceImpl");
             
            List<Persona> personas = personaService.listarPersonas();
        
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }

    }
}
