package test;

import com.consiti.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia trasaccion
        tx.begin();
        //No se especifica el id 
        Persona personal = new Persona("Maria", "Silvia", "msilvia@mail.com", "33221100");
        log.debug("Objeto a persistir: "+personal);
        //Persistir el obj en la DB
        em.persist(personal);
        //termina transaccion
        tx.commit();
        log.debug("Objeto persistido: " + personal);
        em.close();
    }
}
