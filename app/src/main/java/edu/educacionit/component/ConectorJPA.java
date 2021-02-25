package edu.educacionit.component;

import javax.persistence.*;

public class ConectorJPA {
    private EntityManager em;

    public ConectorJPA() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("pg");
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

}
