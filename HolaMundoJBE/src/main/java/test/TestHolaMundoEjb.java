package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada a EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holamundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoPeroEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holamundoEJB.sumar(5, 3);
            System.out.println("Resultado EJB suma 5+3 = "+resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
