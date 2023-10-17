package com.consiti.sga.web;

import com.consiti.domain.Persona;
import com.consiti.sga.servicio.PersonaService;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
    
    @Inject
    PersonaService personaService;
    
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      List<Persona> personas = personaService.listarPersonas();
        System.out.println("personas: " +personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
