package edu.educacionit;

import edu.educacionit.component.ConectorJPA;
import edu.educacionit.model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EjemploQueryServerSide implements Runnable{

    @Override
    public void run() {
        ConectorJPA conectorJPA = new ConectorJPA();
        EntityManager em = conectorJPA.getEntityManager();

        String query = "SELECT u FROM Usuario u";
        TypedQuery<Usuario> tQuery = em.createQuery(query, Usuario.class);
        List<Usuario> usuarios = tQuery.getResultList();

        for (Usuario u : usuarios){
            System.out.println(u);
        }

    }
}
